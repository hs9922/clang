package code.exam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import code.exam.db.DBConnection;

public class StdService {
	
	private PreparedStatement pstmt;
	private ResultSet res;
	private Connection conn;
	
	public StdService() {
		conn=DBConnection.getConnection();
	}
	
	public List<StdInfo>getStdList(int stdId)throws Exception{
		StringBuilder sb = new StringBuilder();
		
		sb.append("select * from std_info");
		
		if(stdId>0) {
			sb.append(" where std_id = ?");
		}
		
		//문서에 발송할 sql를 적어서 리턴
		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setInt(1,stdId);//?에 지정한 순서에 따라 대입된다. 데이터의 타입도 보존
		
		res = pstmt.executeQuery();//sql실행 후 결과를 리턴
		
		List<StdInfo> stdList=new ArrayList<>();
		//결과를 저장
		//출력할 대상이 있는지 검사
		while(res.next()) {
			StdInfo std=new StdInfo();
			std.setStdId(res.getInt("std_id"));
			std.setStdName(res.getString("std_name"));
			std.setStdGrade(res.getInt("std_grade"));
			stdList.add(std);
		}
		
		DBConnection.close(pstmt,res);
		
		for(StdInfo st:stdList) {
			List<StdScore>scoreList=this.getScore(st.getStdId());
			st.setScoreList(scoreList);		
		}
		
		return stdList;
	}
	
	public List<StdScore>getScore(int stdId)throws Exception{
		List<StdScore>scoreList=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		sb.append("select * from std_score where std_id="+ stdId);
		
		pstmt = conn.prepareStatement(sb.toString());
		res = pstmt.executeQuery();
		
		while(res.next()) {
			StdScore score = new StdScore();
			score.setSeq(res.getInt("seq"));
			score.setStdId(res.getInt("std_id"));
			score.setTerms(res.getInt("terms"));
			score.setKor(res.getInt("kor"));
			score.setEng(res.getInt("Eng"));
			score.setMath(res.getInt("math"));
			
			scoreList.add(score);
		}
		DBConnection.close(pstmt,res);
		
		return scoreList;
	}
	
	
	
	
}

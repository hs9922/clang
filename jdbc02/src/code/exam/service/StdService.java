package code.exam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public int insertStudent() throws Exception{
		Scanner scan = new Scanner(System.in);
		
		StdInfo st= new StdInfo();
		
		System.out.println("학생 이름:");
		st.setStdName(scan.next());
		System.out.println("학생 학년");
		st.setStdGrade(scan.nextInt());
		
		StringBuilder sb=new StringBuilder();
		sb.append("insert into std_info(std_name,std_grade) values(?,?)");
		
		pstmt=conn.prepareStatement(sb.toString(),Statement.RETURN_GENERATED_KEYS);
		int dbIndex=1;
		pstmt.setString(dbIndex++, st.getStdName());
		pstmt.setInt(dbIndex++, st.getStdGrade());
		
		int result = pstmt.executeUpdate();//상태 변경 메서드
		
		if(result<1) {
			throw new Exception("학생 정보 입력 실패!");
		}
		
		//auto_increment 된 id값을 전달 받는다.
		res=pstmt.getGeneratedKeys();
		int newId=0;
		
		//새로 생긴 학생의 id값을 가져온다
		if(res.next()) {
			newId=res.getInt(1);
		}
		
		DBConnection.close(pstmt,res);
		
		return newId;
		
		
	}
	
	
	
	
}

package code.exam.main;

import java.util.List;

import code.exam.service.StdInfo;
import code.exam.service.StdScore;
import code.exam.service.StdService;

public class SelectTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdService service = new StdService();
		try {
		List<StdInfo>list=service.getStdList(0);
		
		for(StdInfo st :list) {
			System.out.print("학번:"+st.getStdId()+", ");
			System.out.print("이름:"+st.getStdName()+", ");
			System.out.println("학년:"+st.getStdGrade());
			System.out.println("==================성적==================");
			for(StdScore score : st.getScoreList()) {
				System.out.println("학기:"+ score.getTerms()+",국어:"+score.getKor()+",영어:"+
			score.getEng()+",수학:"+score.getMath());
			}
			System.out.println("=======================================");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

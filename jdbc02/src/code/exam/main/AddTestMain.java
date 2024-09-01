package code.exam.main;

import java.util.List;

import code.exam.service.StdInfo;
import code.exam.service.StdScore;
import code.exam.service.StdService;

public class AddTestMain {

	public static void main(String[] args) {
try {
		StdService service = new StdService();
		int newId=service.insertStudent();
List<StdInfo>list=service.getStdList(newId);
		
		for(StdInfo st :list) {
			System.out.print("학번:"+st.getStdId()+", ");
			System.out.print("이름:"+st.getStdName()+", ");
			System.out.println("학년:"+st.getStdGrade());
			
	}
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}

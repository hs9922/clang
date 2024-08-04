package day03;

public class DoubleLoopExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단 만들기
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+(i*j)+'\t');
			}
			//한단이 끝난 후 줄바꿈
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+'\t');
			}
			//한단이 끝난 후 줄바꿈
			System.out.println();
		}
	}

}

package day03;

public class DoubleLoopExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//별찍기
		for(int i=1; i<=5; i++) { // 외부 for문: i는 1부터 5까지 반복
			for(int j=0; j<i; j++) {//j는 i-1까지 반복
				System.out.print("*"); //*을 출력
			}
			System.out.println();//줄 바꿈
		}
		System.out.println();
		for(int i=1; i<=5; i++) { // 외부 for문: i는 1부터 5까지 반복
			for(int j=0; j<6-i; j++) {//j는 5-i까지 반복
				System.out.print("*"); //*을 출력
			}
			System.out.println();//줄 바꿈
		}
		
	}

}

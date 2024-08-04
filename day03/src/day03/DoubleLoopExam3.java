package day03;

public class DoubleLoopExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {//i는 4까지 반복
			//공백 만들기 -> 줄어듦
			for(int j=0; j<5-i; j++) { //j는 0부터 4-i까지 반복
					System.out.print(" ");
				}
				//별찍기 한개씩 늘어남
			for(int k = 0; k<(i+1); k++) {
				System.out.print("*");
			}
			System.out.println();//줄 바꿈
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			//공백 만들기 -> 증가
			for(int j=1; j<i+1; j++) {
					System.out.print(" ");
				}
				//별찍기 한개씩 감소함
			for(int k = 5-i; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();//줄 바꿈
		}
		System.out.println();
		 for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j < i) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print("*");
	                }
	            }
	            System.out.println(); // 줄 바꿈
	        }
		
	}

}

          

package day02;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 2;
		int sum = 0;
		
		/*
		 * while은 조건이 참과 거짓의 결과가 나오도록 한다.
		 * 결과가 참(true)일 때 까지 반복한다.
		 */
		
		while(count <= 100) {
			
			sum += count;
			count+=2;
		}
		System.out.println("sum = " + sum);
		
		/*sum = 0;
		for(int i = 1; i<=50; i++) {
			sum += i*2;
		}
		System.out.println("sum = " + sum);*/
	}
	

}

package day02;

public class ForQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~100 사이에 짝수를 더해라
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 2; i <= 100; i = i +2) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 50; i++) {
			sum += i*2;
		}
		System.out.println(sum);
	}

}

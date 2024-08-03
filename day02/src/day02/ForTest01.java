package day02;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=1; i<=10; i=i+2){
		System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1 에서 5 까지의 숫자를 더합시다.
		int sum = 0;
		int count = 1;
		for(int i =1; i <= 10; i = i+2) {
			sum += count++;
		}
		
		System.out.println(sum);
		
		sum=0;
		for(int i = 1; i<=5; i++) {
			sum += i;
		}
		System.out.println(sum);
	
		/*sum = 0;	
		for (int i = 2; i <= 100; i = i+2) {
		sum += i; 
		}*/
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
		sum += i; 
		}
    }
    System.out.println("1부터 100까지 짝수의 합: " + sum);
	}
}

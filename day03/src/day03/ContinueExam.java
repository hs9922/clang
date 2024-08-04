package day03;

public class ContinueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int repeatCount=0;//전체 반복 횟수
		int sum=0;
		
		while(count<5) {
			int val =(int)(Math.random()*30)+1;
			repeatCount++;
			if(val%2==1) {
				//홀수라면 진행하지않고 다음
				//continue는 실행문을 종료하고, 다음 반복을 진행하게 한다.
				continue;
			}
			sum += val;
			System.out.print(val + " ");
			count++;//반복을 위한 갯수 증가
		}
		System.out.println();
		System.out.println("반복 횟수 : " + repeatCount + ", 합 : " + sum);
	}

}

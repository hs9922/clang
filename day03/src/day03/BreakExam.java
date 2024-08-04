package day03;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 0;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String values ="";
		while(true) {
			System.out.println("값을 입력하세요(-1은 종료)");
			val=scan.nextInt();
			
			if(val==-1) {
				break; // 반복문 자체를 종료한다
			}
			values += val +" ";
			
			sum+=val;
		}
		System.out.println("입력 값 "+values);
		System.out.println("합 : " + sum);
		//스캐너닫기
		scan.close();
	}

}

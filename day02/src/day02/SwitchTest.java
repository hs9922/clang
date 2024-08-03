package day02;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력(60~100): ");
		//정수 입력
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("학점:A, 점수:" + score);
			break;
		case 8:
			System.out.println("학점:B, 점수:" + score);
			break;
		case 7:
			System.out.println("학점:C, 점수:" + score);
			break;
		case 6:
			System.out.println("학점:D, 점수:" + score);
			break;	
		default:
			System.out.println("학점:F, 점수:" + score);
		}
		
		//스캐너 닫기
		scan.close();
	}

}

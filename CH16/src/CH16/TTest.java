package CH16;

import java.util.Scanner;

public class TTest {

	public static int inputScore() throws NumberFormatException
	{
		int score = 0;
		Scanner sc = new Scanner(System.in);
		//점수를 입력하세요
		System.out.println("점수를 입력하세요");
		String str = sc.nextLine();
		score = Integer.parseInt(str);
		return score;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int score = inputScore();
			System.out.println("입력 점수 : " + score + "점");
		}
		catch(NumberFormatException e)//키보드 숫자가 아닌 문자열로 입력할 시 발생하는 오류 e	
				{
					System.out.println("숫자 입력만 가능합니다.");
				}
				
				System.out.println("프로그램 종료");
	}

}

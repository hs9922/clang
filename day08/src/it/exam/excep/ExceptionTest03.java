package it.exam.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest03 {

	public static void main(String[] args) {
		
		int num=10;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("나누기할 숫자 입력:");
			num=scan.nextInt();
			sum=num/0;
		System.out.println("나누기 결과:"+sum);
		}catch(Exception e) {
			System.out.println("에러!!!");
			System.out.println(e.getClass());
			
		}finally {
			//반드시 있어야하는 것은 아니지만 필요할 때 사용한다.
			//예외 발생 유무와 상관 없이 실행된다.
			scan.close();
			System.out.println("finally 실행");
		}
		
		System.out.println("프로그램 종료");
	}

}

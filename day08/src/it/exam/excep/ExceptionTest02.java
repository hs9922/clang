package it.exam.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		
		int num=10;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("나누기할 숫자 입력:");
			num=scan.nextInt();
			sum=num/0;
		System.out.println("나누기 결과:"+sum);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 안됩니다.");
			System.out.println("system Message:"+(e.getMessage()==null?"없음":e.getMessage()));
			
		}catch(InputMismatchException e) {
			System.out.println("키보드 입력 오류!..잘못된 값을 입력했네요");
			System.out.println("system Message:"+(e.getMessage()==null?"없음":e.getMessage()));
			
		}finally {
			//반드시 있어야하는 것은 아니지만 필요할 때 사용한다.
			//예외 발생 유무와 상관 없이 실행된다.
			scan.close();
			System.out.println("finally 실행");
		}
		
		System.out.println("프로그램 종료");
	}

}

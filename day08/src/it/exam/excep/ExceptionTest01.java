package it.exam.excep;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		int num=10;
		int sum=0;
		
		try {
		sum=num/0;
		System.out.println("나누기 결과:"+sum);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 안됩니다.");
			System.out.println("system Message:"+(e.getMessage()==null?"":e.getMessage()));
		}
		System.out.println("프로그램 종료");
	}

}

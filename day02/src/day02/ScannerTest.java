package day02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력을 받기 위한 방법 - scanner
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("정수를 입력하세요.");
		//입력 대기하다가, 사용자가 키입력하면 값을 전달
		num = scan.nextInt();//nextInt()>>/정수 입력을 대기하고 입력되면 리턴한다.
				
		System.out.println("num = " + num );

		//실수 입력
		System.out.println("실수를 입력하세요.");
		double dnum = scan.nextDouble();
		System.out.println("dnum = " + dnum);
		
		System.out.println("문장을 입력하세요.");
		String str = scan.next();
		
		//next()는 띄어쓰기가 안된다.
		System.out.println("str = " + str);
		
		System.out.println("문장을 입력하세요.2");
		//nextLine()은 입력 받기전에 buffer에 남아있는 값을 체크한다.
		//buffer에 값이 있다면 비우면서 그 값을 받는다.
		//buffer -> 임시 메모리 공간, 키보드 입력이 시작되어 엔터(입력) 전까지 입력된 값을 저장하기 위한 임시 공간이 필요한데 
		//이런 임시적인 메모리 공간을 buffer라고 한다.
		scan.nextLine();//버퍼 비우기용으로 쓴다.
		
		String str2 = scan.nextLine();
		
		System.out.println("str2 = " + str2);
		
		//다썻으면 닫자
		scan.close();
	}               

}

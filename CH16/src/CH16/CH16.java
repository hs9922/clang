package CH16;
import java.util.Scanner;
import java.util.InputMismatchException;
//에러(Error) : "자바 프로그램 실행 시에 의도하지 않게 발생하는 문제점"

//자바 에러 종류
//에러
// 프로그램 중요 기능 수행을 불가능하게 하는 에러
// 에러를 해결한 후, 프로그램을 재실행 해야함

//예외
// 에러보다는 가벼운 문제
// 프로그램 자체적으로 문제 해결 가능

//예외처리 목적
// 예외 발생 시 프로그램이 비정상 종료되는 것을 막고, 예외와 관련 없는 기능은 정상 동작하도록 처리하는 작업을 의미

//자바 예외 처리 방법
// 프로그램 실행 시 발생하는 예외들을 각각 Exception클래스로 제공한다.
//해당 예외가 발생하면 JVM이 해당 예외에 대한 클래스 객체를 만들어서 프로그램으로 전달한다.
// 프로그래머는 해당 예외 객체를 받아서 예외처리를 한다.


//Exception클래스 객체를 생성 시 사용되는 생성자
// Exception() : 예외 메시지 없이 객체를 생성
//	Exception(String message) : 예외 생성시 예외 메시지를 예외 객체에 전달
//	Exception(String message, Throwaeble cause) : 예외 생성시 메시지와 예외 객체에 전달

//try - catch - finally
//finally블록은 예외 발생 유무와 상관없이 실행되는 구문이고 생략이 가능하다.
// 예외 처리를 할 때, 예외와 상관없이 반드시 처리해야 하는 구문들을 작성할 때 사용되며, 보통 외부 연동이나 예외가
// 발생해도 정상종료 되어야 할 구문들에서 사용한다.

public class CH16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NullPionterExcetpion : 객체는 정의되었는데 실제 메모리에 생성되지 않았을경우 발생하는 예외
		
		//배열을 변수로 만들기만 하고 선언하지 않음
		//String[] strArray = null;
		
		//System.out.println("strArray[0] = " + strArray[0]);
		
		//NumberFormatException : 잘못된 문자열을 숫자로 형 변환할 때 발생 
		
		/*String str01 =  "11";
		String str02 =  "11.2";
		
		//정수 형태의 문자열을 정수로 변환
		int num01 = Integer.parseInt(str01);
		
		System.out.println("String to in : " + num01); 
		
		// 실수 형태의 문자열을 정수로 변환
		// 정수는 실수를 포함하지 않기 때문에 소수점(.)을 문자로 인식
		int num02 = Integer.parseInt(str02);
		
		System.out.println("String to in  : " + num02);*/

		/*String str1 = "123";
		String str2 = "456.7";
		
		int num01 = Integer.parseInt(str1);
		
		System.out.println("String to in : " + num01); 
		
		int num02 = Integer.parseInt(str2);
		
		System.out.println("String to in : " + num02);*/
		
		//ArrayIndexOutOfBoundsException : 배열에서 인덱스 범위를 초과해 사용할 때 발생
		
		//int[] arr = {1,6,7,9,10};
		
		//System.out.println(arr[5]);
		
		//예외 처리 과정
		//1. 예외가 발생하면 JVM 에게 예외를 던진다.
		//2. JVM은 발생한 예외를 분석한 후, 해당하는 예외 객체(인스턴스)를 생성한다.
		//3. JVM은 생성한 예외 객체를 예외가 발생한 곳으로 돌려준다.
		//4. JVM이 던진 예외를 catch문에서 받아서 예외를 처리한다.
		//5. 예외를 처리한 후 다른코드는 정상 실행된다.
		
		//try - catch문
		//try
		//{ 예외가 발생할 가능성이 있는 코드 }
		// catch(예외 클래스명 e)
		//{ 예외 처리 코드 }
		
		
		/*int result = 0;
		
		try
		{
			//예외가 발생할 수 있는 코드
			result = 10 / 0;
			System.out.println("나누기 결과 " + result);
		}
		//나누기 관련 예외 처리 catch가 매개변수로 받으면 시스템이 발생한 예외를 잡을 수 있다.
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누기 할 수 없습니다");
		}
		
		System.out.println("프로그램 종료");*/
		
		Scanner sc = new Scanner(System.in);
		
		/*try
		{
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if(score >= 65)
			{
				System.out.println("합격입니다");
			}
			else
			{
				System.out.println("불합격입니다.");
			}
		}
			catch(InputMismatchException e)
			{
				System.out.println("키보드 입력이 잘못되었습니다");
			}
			
			sc.close();
			System.out.println("프로그램 종료");*/
		/*try
		{
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();
			
			if(age >= 19)
			{
				System.out.println("성인입니다");
			}
			else if(age >= 0)
			{
				System.out.println("미성년자입니다.");
			}
		}
			catch(InputMismatchException e)
			{
				System.out.println("입력 형식이 잘못되었습니다");
			}
			
			sc.close();
			System.out.println("프로그램 종료");*/
		try
		{
			System.out.println("몇번째 카드를 뽑으시겠습니까? : ");
			int[] cards = {4,5,1,2,7,8};
			
			int i = sc.nextInt();
			System.out.println("뽑은 카드 번호는: " + cards[i]);
           
        } 
		catch (InputMismatchException e) 
		{
            System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
        }
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("해당 카드 번호가 없습니다");
		}
		
		finally
		{
			sc.close();
			System.out.println("프로그램 종료");
		}
		
		
		
	}

}

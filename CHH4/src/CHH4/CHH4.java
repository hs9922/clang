package CHH4;

import java.util.Scanner;


public class CHH4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문(반복문)
		//반복 횟수가 정해져 있을 때
		//for(초기식 ; 조건식 ; 증감식)
		// {
		// 	반복할 코드
		// }

		// 초기식 : int a / int i = 반복문에서 사용할 변수를 초기화
		// 조건식 : a>5 = 반복 수행할 범위를 구현
		// 증감식 : 초기값을 증가하거나 감소시킨다.
		// 반복할 코드 : 조건식이 true면 false가 나올때 까지 반복하여 실행.

		//for문을 이용하여 별찍기
		/*for(int i = 1;  i <= 5; i++)
		{
			System.out.print("*");
		}*/
		
		//for문 <1부터 100까지 숫자 중 짝수의 합 출력하기>
		/*int sum = 0;
		
		//1부터 100까지 반복하기
		for(int i = 1 ; i <= 100; i++)
		{
			 
			//만약에 2로 나누어 떨어지면 짝수
			if(i % 2 ==0)
			{
				//짝수의 합을 더함
				sum += i;
			}
		}
		
		System.out.println("짝수의 합 : " + sum);*/
		
		//이중 for
		//문법
		/*for(초기값 ; 조건식 ; 증감식) // 외부 for문 (행)
		{
			랙
		 */
		//외부for문
		/*for(int i = 1 ; i <= 5; i ++)
		{
			for(int j = 1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(int i = 1 ; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i =5 ; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//구구단 출력하기
		//2단부터 8단까지 반복
		//행은 2부터 시작/ 열은 1부터 시작
		/*for(int i =2; i < 10; i++)//외부 행
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			//단 별로 줄바꿈
			System.out.println();
		}*/
		
		//while문(반복문)
		//while문은 반복 횟수가 정해져 있지 않고, 조건식이 true일때만 계속 반복한다.
		// 조건식이 false면 종료.
		// 주의해서 사용하지 않으면 무한루프같은 오류에 빠지기 쉬운 문법이다.
		
		//구조
		// 초기식(변수 선언)
		/*while(조건식)
		{
			실행문 -> 조건식이 true 일때 반복
		}*/
		
		//실행순서
		//1. 조건식을 확인하고 해당 조건이 true인지 확인
		//2. 만족할 경우 실행문 돌림
		//3. 다시 조건 확인
		//4. 조건이 만족하지 않을 경우 종료
		
		//while문 예제 <1부터 10까지의 합 출력하기>
		/*int sum = 0;
		int i = 1;
		
		while(i <= 10)
		{
			//sum에 값 누적
			sum += i; // sum = sum + i (복합대입 연산자 사용)
			i++;
		}
		
		System.out.println("합 : " + sum);*/
		
		//while 사용
		//[실행결과]
		/*i=1
		i=2
		i=3
		i=4
		i=5
		while 문 밖에서의 i의 값 6*/
		/*int i = 1;
		while(i < 6)
		{
			System.out.println("i=" + i); // 반복할 코드
			i++; //증가
		}
		System.out.println("while문 밖에서의 i의 값 : " + i);*/
		
		//while문을 이용해서 1부터 5까지의 합 구하기
		/*int i =1;
		int sum = 0;
		while(i <=5)
		{
			sum +=i; 
			System.out.println("i = " + i +", sum = "+ sum);
			i++;//증감코드는 마지막에 적어주기
		}
		System.out.println("1부터 5까지의 합: "+sum);*/
		
		//do-while문
		//while문과 동일하게 조건을 만족할 때 까지 반복합니다.
		// 다만 while문과 다른 점은 루프를 한번 실행한 후 조건식을 검사한다.
		// 기본 문법
		/*do {
			실행문
		}while(조건식)
			
		1. do에 있는 실행문이 먼저 실행이 되고
		2. while문에 있는 조건을 검사합니다.
		3.조건이 true이면 do 안에 있는 실행문을 실행 시킴.*/
		
		//do-while문은 현업에서 많이 사용되지 않는다.
		//do while문 <1부터 10까지의 합 출력하기>
		//합을 담을 변수
		/*int sum = 0;
		//초기식
		int i = 1;
		
		do {
			sum += i; // sum(0) = sum(0)+ i(1) => sum = 1
			i++; // i = 2
		} while(i<= 10);
		
		System.out.println("합 : " + sum);
		
		//
		// 물통에 물을 10번 채워라 >> for 문 : 반복 횟수가 지정
		// 물통에 물이 가득찰 때 까지 채워라 while 문 : 특정 조건이 부여되는 경우 > 조건이 만족할 때 까지 반복
		// 물통에 물을 따라보고 새지 않으면 끝까지 채워라 do-while 문 > 특정조건과 옵션이 부여되는 경우 > 한번 실행 후 반복*/
		
		
		//기타 제어문
		// continue문 : 반복문 안에서 continue문을 만나면 이후의 실행 코드는 수행되지 않고 반복문의 처음으로 돌아가 반복
		//<1부터 100까지의 짝수의 합>
		/*int sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 !=0) //0이 아닐 경우 홀수 // 홀수인 것은 continue문을 사용해서 뛰어넘음 // 특정 조건 건너뛰기
			{
				continue; //이번 차수를 종료하고 다음것을 실행
				//예를 들어서 for문에서 1이 돌아가면 뛰어넘고 2가 실행
				// for문에서 3이 돌아가면 뛰어넘고 4가 실행
			}
			sum += i;
		}
		
		System.out.println("짝수 합: " + sum);*/
		
		//숫자 맞추기 게임
		//break문 사용

		int mNumber= (int)(Math.random() * 50) + 1;
		Scanner sc = new Scanner(System.in);
		boolean isMatched = false;
		
		for(int i = 0; i < 10 ; i ++)
		{
			System.out.println("찾는 숫자를 입력하세요 >>");
			int guess = sc.nextInt(); // 입력값을 guess변수에 저장
			
			if(guess == mNumber)
			{
				System.out.println((i+1) + "번째에 맞췄습니다.");
				isMatched = true;
				break;
			}
			
			else if(guess > mNumber)
			{
				System.out.println("맞춰야 할 숫자가 더 작습니다.");
			}
			
			else if(guess < mNumber)
			{
				System.out.println("맞춰야 할 숫자가 더 큽니다.");
			}
		}
		
		if(!isMatched)
		{
			System.out.println("정답을 맞추지 못했습니다.");
		}
	}	
}



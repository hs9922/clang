package CH3;
import java.util.Scanner;

public class CH3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제어문 : 실행문의 수행 순서를 변경하는것
		// 조건문, 반복문 ,분기문
		// 실행문 : 순차적으로 실행
		
		//조건문 " 조건식에 따라서 프로그램의 흐름을 제어할 수 있는 문법
		// 조건문의 종류 if/ switch
		//조건문의 문법   
		// if(조건식) 
		//{ 
		// 실행코드;
		//}  
		
		//if문 
		//변수 선언 및 초기화 
		 
		/*int result = 0;
		//if문--------
		
		// if문의 조건식이 true일때 실행
		if(3>2)
		{
			result = 3;
		}
		System.out.println(result);*/
		
		//미션
		// 입력 받기(Scanner) 19
		// 만약에 나이변수가 19보다 크다면
		//성인입니다 출력
		
		//실행결과
		//나이를 입력하세요.
		//20
		//성인입니다.*/
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		//문법
		//Scanner 객체명(변수명) = new Scanner(System.in);
		//입력받은 숫자를 변수에 담아주기
		int age = sc.nextInt();
		
		//조건문
		if(age > 19)
		{
			//if문의 조건이 true일때만 실행
			System.out.println("성인입니다");
		}
				
		//if- else
		// if문이 A라는 코드일 때 A가 성립되지 않는다면
		// else문 B라는 코드 실행
		// if(조건식)
		//{코드;}
		//else	:조건식이 false일 때 사용
		//{코드;}
	
		//if-else문 실행
		/*int num = 5;
		if(num > 4)
		{
				System.out.println(num + "은(는) 4보다 큽니다");
		}
		else
		{
			System.out.println(num + "은(는) 4보다 작습니다");
		}*/
		
		//미션!
		/*int a = 4;
		int b = 10;
		
		if (a > b)
		{
			System.out.println(a + " 가 " + b + " 보다 큽니다");
		}
		else 
		{
			System.out.println(a + "가 " + b + "보다 작거나 같습니다");*/
		
		//활용2
		/*int a = 4;
		int b = 10;
		int max = 0;
		
		//만약에 a가 b보다 크다면
		// max 값을 a로 할당해주기(값 넣어주기)
		
		//아니라면
		//max값 b로 할당해주기
		if (a > b) 
		{
			max=a;
		}
		
		else 
		{
			max=b;
		}
			System.out.println(a + "와 " + b +"중에 큰수는 " +max+ "입니다");*/
		
		//"나이를 입력하세요 출력"
		/// 나이 값 변수에 할당
		//만약에 나이가 19보다 크다면
		//"성인입니다: 출력
		// 아니라면
		// "미성년자입니다:출력
		/*Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		
		if (age > 19)
		{
			System.out.println("성인입니다");
		}
		else
		{
			System.out.println("미성년자입니다");
		}*/
		
		//if - else if
		// 한 문장에 여러개의 조건식을 사용할 수 있는 문법
		// 새로운 문법이 아니고 if- else if가 여러개 사용되는 것입니다.
		//if(조건식1)
		// { //조건식1이 true 일때 실행}
		//else if(조건식2)
		//{//조건식 2가 true이고 조건식1은 false일때 실행}
		//else
		//{조건식1,2가 모두 false일때 실행}
		
		//if else if문 실습
		/*int fa = 7;
		
		//만약 fa가 5보다 작다면
		if(fa < 5) //조건문 1
		{
			System.out.println("좋아하는 숫자가 5보다 작습니다."); // 조건문1이 참일때 실행되는 코드
		}
		
		else if(fa == 7)//조건문 2 
		{	
			System.out.println("좋아하는 숫자는 7입니다."); 
		}
		
		else// 조건문 1,2가 모두 false라면 (거짓이라면)
		{
			System.out.println("좋아하는 숫자가 5입니다.");
		}*/
		
		//"시험점수를 입력해 주세요"
		// 만약 score 90보다 크거나 같다면 
		//90~100점입니다. 출력
		// A학점입니다. 출력
		
		// 다른경우 score 80보다 크거나 같다면
		// 80~90점입니다. 출력
		// B학점입니다. 출력
		
		// 다른경우 score 70보다 크거나 같다면
		// 70~80점입니다. 출력
		// C학점입니다. 출력
		
		// 다른경우 score 60보다 크거나 같다면
		// 60~70점입니다. 출력
		// D학점입니다. 출력
		
		//아니라면
		//60점 미만입니다. 출력
		//F학점입니다.출력
		/*Scanner sd = new Scanner(System.in);
		System.out.println("시험점수를 입력해 주세요");
		
		int score = sd.nextInt();
		if (score >= 90)
		{
			System.out.println("90~100점입니다");
			System.out.println("A학점입니다");
		}
		else if (score >= 80)
		{
			System.out.println("80~90점입니다");
			System.out.println("B학점입니다");
		}
		else if (score >= 70)
		{
			System.out.println("70~80점입니다");
			System.out.println("C학점입니다");
		}
		else if (score >= 60)
		{
			System.out.println("60~70점입니다");
			System.out.println("D학점입니다");
		}
		else
		{	
			System.out.println("60점 미만입니다");
			System.out.println("F학점입니다");
		}*/
		//Scanner 쓸때 필요한 문장
		/*Scanner sd = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요");
		
		int A = sd.nextInt();
		int B = sd.nextInt();
		if (A>B)
		{
			System.out.println(">");
		}
		else if (A<B)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}*/
	
		//switch문(조건문에 속한다.)
		// 하나의 변수 안에 저장되어 있는 값을 다수의 값과 비교해야 할 때 사용
	
		//문법(기본 구조)
		//switch(변수)
		//{
		// case 값1 : =if
		// 	코드
		// break;
	
		/// default : (= else)
		// 코드;
	//}
		//switch문 실습
	
		//변수 선언 및 초기화
		/*int num = 7;
		
		switch(num)
		{
		case 1:
			System.out.println("num은 1 입니다.");
			break;
			
		case 7:
			System.out.println("num은 7 입니다.");
			break;
			
			default :
				System.out.println("num은 1도 7도 아닙니다");
		}*/
		
		//출력원하는 숫자를 입력하세요(1-5)
		//입력받은 숫자를 num변수에 할당하기
		//switch문 활용
		// 5 
		// "5를 입력하셨습니다."
		// 4 
				// "4를 입력하셨습니다."
		// 3 
				// "3를 입력하셨습니다."
		// 2 
				// "2를 입력하셨습니다."
		// 1 
				// "1를 입력하셨습니다."
		//"1-5까지의 숫자를 입력하세요" 출력
		
		//실행결과
		//원하는 숫자를 입력하세요(1-5)
		//3
		// 3을 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1-5까지의 숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		//if - else if문에서 else if문의 수는 제한이 없다(0);
		// if - else if문에서 if조건문과else if조건문이 모두 참이면 둘 다 실행된다 (X);
		switch(num) //'=='으로 비교할 수 있는 하나의 값만 들어갈 수 있다.
					//break를 사용해서 switch문을 빠져나간다.
		{
		case 1:
			System.out.println("1을 입력하셨습니다.");
			break;
		case 2:
			System.out.println("2를 입력하셨습니다.");
			break;
		case 3:
			System.out.println("3을 입력하셨습니다.");
			break;
		case 4:
			System.out.println("4를 입력하셨습니다.");
			break;
		case 5:
			System.out.println("5를 입력하셨습니다.");
			break;
			
			default :
				System.out.println("1-5까지의 숫자를 입력하세요.");
		}
	}
}
	
	

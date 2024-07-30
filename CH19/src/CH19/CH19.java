package CH19;

interface CompareNumber{
	int compareTo(int num01, int num02);
}
//람다 표현식 : 함수형 프로그래밍을 구성하기 위한 함수식이며, 다시 말해 메서드를 간결한 함수 식으로 표현한 것
// 람다식 : 이름없는 함수 = 익명 함수

// 문법
// int add (int x, int y)
/*{
 * return x+y;
 * }
 * 
 */

/* 매개변수		함수 구현
 * (x,y) -> {return x+y}; 
 */

/*소괄호 생략하기
 * 매개변수 자료형을 생략할 수 있으며, 매개변수가 한개인 경우 소괄호 생략 가능(단, 매개변수 두개 이상을 경우 생략 불가)
 * 
 * str -> {System.out.println();}
 * 
 * 
 * 중괄호 생략하기
 * 함수 구현 내용이 한 문장이거나 return이 없다면, 즉 함수의 return타입이 void라면 구현부에 있는 중괄호 생략 가능
 * (단, 함수 내용이 두 문장 이상이거나, return 타입이 있는 경우 생략 불가)
 * 
 * (x,y) -> System.out.println();
 *
 * return 생략하기
 * 중괄호 안의 구현 코드가 return문만 존재할 때 중괄호와 return을 모두 생략할 수 있음
 * (x, y) -> { return x>y ? 1 :0}
 * 
 * (x,y) -> x > y ? 1 :0;
 * 
 */

/*
 * 함수형 인터페이스 선언
 * 함수형 인터페이스는 자바의 인터페이스를 이용해 선언
 * 다만, 익명 함수로 구현하기 때문에 하나의 메서드만 지니도록 합니다.
 * 
 *  @FunctionInterface
 *	//메서드가 두개면 오류
 * */

public class CH19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CompareNumber compare = new CompareNumber() {
			
			@Override
			public int compareTo(int num01, int num02)
			{
				//삼항연산자
				// num01 > num02 참이라면 1을 반환 (if)
				
				// num01 < num02 첫번째 조건이 거짓일때 이 조건이 실행 (else if)
				// 만약 num01 < num02 참이 된다면 -1을 반환
				
				//else 조건이 모두 거짓이라면 0을 반환
				return	num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
			}
			
		};*/
		
		//인터페이스 객체 선언시 람다식을 이용해 함수 구현
		CompareNumber compare = 
				(num01, num02) -> {return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;};
		
		int num01 = 10;
		int num02 = 20;
		
		// 두 수를 비교해 결과를 반환
		int result = compare.compareTo(num01, num02);
		
		//비교에 대한 결과 출력
		if(result > 0)
		{
			System.out.println("num01이 num02보다 크다");
		}
		
		else if(result < 0)
		{
			System.out.println("num01이 num02보다 작다");
		}
		else 
		{
			System.out.println("num01이 num02과 같다");
		}
	}

}

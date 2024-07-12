package CH7;

public class CH7 {

	// 실행 메서드
	// 접근 제한자 : 변수와 마찬가지로 해당 메서드에 접근할 수 있는 범위
	// 반환타입(return) : 메서드를 호출하면 메서드는 블록 안에 있는 코드들을 실행한 후 결과값을 반환
	// 하는데 어떤 타입으로 반환할 것인지 미리 정해줌.
	// 반환 타입이 없는 경우 void를 사용
	
	// 메서드 이름 : 변수처럼 이름을 가지고, 메서드를 호출할 때 사용
	//===========문법
	// 접근제한자	반환타입	메서드이름()
	//{
	//		실행 코드
	//}
	
	public static void main(String[] args) {
	/*	//메서드(method)
		//메서드란, 클래스 안에서 '특정 기능을 수행하기 위해'
		// 코드들을 따로 하나의 블록으로 묶어 놓은 '집합'을 말한다.
		// 필요에 따라 집합을 호출해 사용할 수 있다.

		//main 메서드(실행) 안에서 printHello() 메서드 호출
		printHello();
		printBye();
		
	}

	//printHello 라는 메서드
	static void printHello()
	{
		System.out.println("안녕하세요");
		System.out.println("만나서 반갑습니다.");
	}
	
	static void printBye()
	{
		System.out.println("잘가요");
	}*/
	
	// 객체 생성
	// 객체 생성 문법
	// 메서드가 있는 클래스 	  참조변수	  = new 클래스();
	// 참조 변수.메서드이름();
	// (단, 같은 클래스에 있는 메서드를 호출할 때는 메서드 이름만 호출)
	
		//jo는 참조변수기 때문에 개발자 마음대로 이름을 지음
		//객체 생성
		/*Jogger jo = new Jogger();
		jo.run();
		jo.name = "김나비";
		jo.sayName();*/
		
		CH7 ch = new CH7(); // 클래스 객체화
		ch.printSumFrom(); // 메서드 호출
	
	
	}
	
	public void printSumFrom()
	{
		//지역 변수 : 메서드 블록{} 내에서 선언한 변수
		// 사용 범위 : 선언한 메서드의 구현 블록 내에서만 가능
		int sum = 0;
		for(int i = 1; i<= 100; i++)
		{
			sum+= i;
		}
		System.out.println("1부터 100까지의 합 :" + sum);
	}
	
	
	
}

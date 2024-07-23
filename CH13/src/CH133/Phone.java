package CH133;

public abstract class Phone {
	
	//추상 메서드
	// 추상 메서드를 선언할 때는 abstract를 함께 표기해야함.
	//또한 메서드 구현부인 중괄호{} 대신 구현부가 없다는 의미로 끝에 세미콜론(;)을 사용
	//[접근 제한자] abstract 반환타입 메서드이름(매개변수...);ㅣ
	
	//일반 메서드
	//public void main()
	//{
	//
	//}
	
	//추상 메서드
	//public abstract void main();
	
	//추상 메서드 구현
	abstract void openingLogo();
	
	//일반 메서드 구현
	void PowerOn()
	{
		openingLogo();
		System.out.println("핸드폰 켜짐");
	}
	
	void PowerOff()
	{
		System.out.println("핸드폰 꺼짐");
	}
}

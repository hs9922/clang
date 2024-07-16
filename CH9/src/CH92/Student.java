package CH92;

public class Student {
	
	//static키워드
	//static의 사전적 의미 '고정된(형용사)'라는 뜻을 가짐
	//static이 앞에 붙는 멤버들은 다른 멤버들과 달리 객체를 생성하지 않고 바로 사용할 수 있다.
	
	//그 이유는 객체를 생성할 때 메모리에 올라가는것이 아니라, 프로그램을 시작할때 메모리에 올라가고 프로그램이 종료될때
	//메모리에서 사라지기 때문이다.
	
	
	//정적 멤버(변수)
	static String schoolName = "코리아 고등학교";

	//정적 메서드
	static void goToSchool()
	{
		System.out.println("학교에 갑니다");
	}
}

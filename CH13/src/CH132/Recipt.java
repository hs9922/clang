package CH132;

//추상 클래스와 추상 메서드
//추상 클래스와 일반클래스 차이점
//1. 객체 생성 가능 여부
// 추상클래스 X(미완성) , 일반 클래스 O
// 다중상속 : 추상클래스는 다른 클래스를 상속받으면서도 다중 상속이 가능
//		 일반 클래스는 단일 상속만 지원
//
//2. 인스턴스화
// 추상클래스 X(미완성) , 일반 클래스 O

//추상클래스 : 하나 이상의 추상 메서드를 포함하는 클래스를 가리켜 추상클래스라고 함
// [접근 제한자] abstract class 클래스이름
//{
 	// 필드, 생성자, 메서드(추상메서드)
//}

//추상클래스
public abstract class Recipt {
	
	String chef;
	
	Recipt(String chef)
	{
		this.chef = chef;
	}
	
	void info()
	{
		System.out.println("이 레시피는 " + chef + "레시피 입니다");
	}

	//추상 메서드 예시
	//abstract void info();
}

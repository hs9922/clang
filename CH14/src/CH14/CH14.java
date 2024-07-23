package CH14;

// 인터페이스
// 추상클래스가 발전된 개념

// 특징
// 추상클래스가 발전된 개념으로, 인스턴스 생성이 불가
// 멤버(변수)로는 상수와 추상메서드만 가능하다. // 상수란? 고정된 값 -> 값을 바꾸지 못하기 때문에 충분한 고민을 하고 선언
// 업캐스팅(부모 타입 참조 <- 자식 객체) 참조 변수로 사용할 수 있습니다.
// 하위 클래스에서는 '구현'관계
// 하위 클래스에선 여러 개의 인터페이스를 구현할 수 있다.
// 자바의 단일 상속 기능을 보완

//인터페이스 [접근제한자] interface 인터페이스 이름
//{
	//public static final 자료형 상수명 = 값;
	//static : 객체가 생성되지 않는 인터페이스이기 때문에, 내부상수에 접근하려면 클래스 변수처럼 static으로 선언되어
	// 메모리에 올라가 있어야 한다.
	//final : 상수를 뜻하는 키워드
//}

//구현 클래스
//[접근 제한자] class 클래스이름 implements 인터페이스 이름{

//}

//인터페이스와 추상클래스의 차이점
// 공통점
// 1. 추상화 구현 : 둘 다 추상화를 구현하기 위해 사용. 구체적인 구현을 숨기고 사용자에게 필요한 기능을 제공하는 
// 추상 설계가 가능

// 2. 상속과 확장 : 추상 클래스와 인터페이스는 상속을 통해 기능을 확장할 수 있다.
// 클래스는 하나의 추상 클래스만 상속할 수 있지만, 인터페이스는 여러 개를 구현할 수 있다.

//3. 추상 메서드 포함 : 추상클래스와 인터페이스는 추상 메서드를 포함할 수 있다.
// 추상메서드는 선언만 있고 구현이 없는 메서드로 하위 클래스나 구현클래스에서 반드시 구현해야한다.

// 차이점
// 선언과 구현 : 추상클래스는 일반 클래스처럼 필드, 생성자, 메서드를 가질 수 있다.
// 			  인터페이스는 상수 필드와 추상메서드만 가질 수 있다.

// 다중 상속 : 추상클래스와 일반클래스는 단일 상속만 허용, 인터페이스는 다중상속이 가능하다.

// 용도 : 추상클래스는 상속을 통해 공통된 기능을 재사용하고 확장하는것이 목적
//		인터페이스는 클래스 간의 계약을 정의하고 다양한 타입의 객체가 특정 동작을 보장하기 위해



public class CH14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car 클래스는 인터페이스이기 때문에 객체생성이 불가능 해서 오류
		//Car c = new Car();
		
		// \불가능한 코드 : 상수는 값을 변경할 수 없기 때문에
		//Car.SAFE_SPEED = 80;
		
		Truck t = new Truck();
		
		// 인터페이스 타입은 업캐스팅으로 사용 가능하다
		Car s = new Sportcar();
		
		System.out.println("모든 차의 안전 속도 : " + Car.SAFE_SPEED);
		// 상수 사용 방법 : 인터페이스 이름.상수이름
		
		//트럭 속도 높, 낮 ,멈
		t.speedUp();
		t.speedDown();
		t.stop();
		
		//스포츠카 속도 높, 낮 ,멈
		s.speedUp();
		s.speedDown();
		s.stop();
		//s.turbo(); => 불가능 : 업캐스팅 상태에선 구현 클래스에만 정의된 메서드에 접근할 수 없다.
		// 다운캐스팅은 상위 클래스로 선언된 객체를 하위 클래스로 형변환하는것
		// 이 과정에서 상위 클래스로 선언된 객체가 실제로는 하위 인스턴스 일 때 가능하다.
		// 명시적으로 형 변환을 해줘야 한다.
		
		//Superclass : 상위클래스; subClass 하위클래스
		/*SuperClass ob = new subClass();
		//다운캐스팅
		subClass ob2 = (subClass)ob;*/
		//하위클래스 참조변수 = (하위클래스)상위클래스의 참조변수
		
		Sportcar s1 =(Sportcar)s;
		s1.turbo();	
	}

}
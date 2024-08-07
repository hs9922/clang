package CH9;

public class CH9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그래밍 글 쓰기
		// 프린트
		// 조건문
		// 반복문
		// 메서드까지
	 	// 프로그래밍 문서정리
		
		// 절차 지향 프로그래밍 : 컴퓨터가 데이터를 처리하는 방식으로 프로그래밍 하는 방식
		// 데이터 입력 > 데이터 처리 > 결과 출력

		// 절차 지향 프로그래밍 특징 (돌을 깎아서 모델을 만든다)
		//1. 일을 처리하는 순서와 과정이 중요
		//2. 순서, 과정이 달라지면 새로운 작업 모델이 필요
		//3. 컴퓨터의 작업 방식을 프로그래밍에 적용한 것
		//4. 기존 코드의 재사용성이 매우 낮다.
		
		//객체(Object) 지향 프로그래밍 (건담) == 클래스
		//객체란? 우리 주위를 둘러싼 모든 대상, 사물
		
		//객체 지향 프로그래밍 특징
		// 1. 사람이 생각하고 행동하는 방식으로 프로그래밍 한다.
		// 2. 순서, 과정이 중요하지 않다.
		// 3. 이해하기 쉽고, 모듈화(조힙화)가 쉽다.
		//****// 4. 기존 코드이 재사용성이 높고 유지보수가 용이하다.////******
		// 5. 설계중심 언어이다.
		
		//클래스들을 조립하여 원하는 최종 기능을 개발하는 것이 객체 지향 프로그래밍 이다.
		
		//객체 지향 프로그래밍 과정
		//객체 주체
		//주체(subject) : 일반 사용자, 사람
		//객체(Object) : 주체를 바라본 대상(사람, 사물, 개념등)
		//1. 아이디어 도입 ----- 프로그램으로 구현할 대상을 정한다.
		//2. 아이디어 분석 ----- 주체의 관점에서 대상을 분석한다. (직원 : 차를 빌려주는 기능, 고객 : 차를 빌리는 기능..)
		//3. 객체 추출 후 속성과 기능 찾기 --- 객체를 추출 후 속성과 기능(행위)를 찾습니다.
		//4. 객체 모델링 ----- 개발자 관점에서 객체의 속성과 행위를 정제한다.
		//5. 클래스 변환 ----- 객체를 클래스로 변환한다.
		//6. 인스턴트 생성 및 사용 ----- 메모리에 인스턴스 생성 후 사용
		//						   Dog d = new Dog(); //객체생성
		//						   d.eat(); // 객체에 있는 함수 호출
		
		//객체의 속성과 기능
		// 속성 : 객체가 가지고 있는 특징이나 상태 (변수)
		// 기능(행위) : 객체가 수행하는 동작, 행위, 업무 (함수)
		
		
		//이름, 빌려준다, 나이, 예약을 한다, 직급, 차량을 확인한다.
		
		//렌터카 회사 객체들의 속성과 동작
		//직원	속성 : 이름, 나이, 직급 
		//      기능 : 빌려준다, 예약을 한다, 차량을 확인한다		
		
		//고객	속성 : 이름, 주소, 나이, 전화번호
		//		기능 : 예약한다, 사용한다, 지불한다.
		
		//객체명 : 클래스명
		//필드(전역변수) : 속성
		//메서드 : 기능
		
		//클래스명 작성 규칙
		//1. 클래스명의 첫글자는 반드시 대문자이어야 한다.
		//2. 하나이상의 단어로 이루어져야 한다.(Student, UniStudent)
		//3. 첫 글자는 숫자로 선언할 수 없다.
		//'$' '_' 이외의 특수문자는 클래스명으로 사용할 수 없다.
		//5. 자바 키워드나 자바에서 제공하는 클래스명은 사용할 수 없다.(String, Array-> MyString)
		
		//클래스 구현
		//문법
		//public class 클래스명{
		// 필드(전역변수)
		// 메서드(함수)
		// 생성자
		// }
		
		//필드, 메서드, 생성자 클래스는 {} 블록 안에 구현
		
		
		// 인스턴스 == 객체
		// 인스턴스 정의
		// 미리 정의한 클래스를 이용하여 컴퓨터 메모리에 필드와 메서드를 가지는 객체
		// '클래스 객체'
		
		// 클래스는 : 붕어빵 틀
		// 인스턴스 : 붕어빵 (인스턴스(객체화)를 시켜서 다른 클래스에서 사용이 가능하기 때문에)
		// 인스턴스 생성 방법
		// new 연산자를 이용해서 클래스의 인스턴스를 메모리에 생성한다.
		// Person p = new Person();
		// 형식 : new 클래스명();
		
		// 인스턴스 접근 방법
		// 인스턴스와 같은 클래스 타입 변수 선언
		// Person p => 문법 : 클래스명 변수
		
		// 생성된 인스턴스를 변수에 대입
		// Person p : new Person();
		// 문법 : 변수 = new 클래스명();
		
		//변수 선언과 동시에 대입하기
		// 클래스명 변수 = new 클래스명();
		
		
		// 실행 클래스
		// 각각의 클래스들의 인스턴스를 생성한 후, 최종적인 기능을 구현하는 클래스
		// 반드시 main()메서드를 포함하고 있어야 한다.
		
		
	}

}

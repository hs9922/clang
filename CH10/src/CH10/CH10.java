package CH10;

public class CH10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//생성자
		//클래스를 구성하는 구성요소 중 하나인 생성자는,
		//객체 생성할 때 호출되어 '객체의 초기화'를 담당하는 특별한 메서드
		
		//생성자의 정의
		//최초로 호출되면서 클래스 인스턴스를 생성한다.
		//반드시 클래스명과 동일해야합니다.
		
		//생성자의 특징
		//메서드와 비슷한 기능을 가진다.
		//리턴타입이 없다.
		//생성자를 구현해주지 않으면 컴파일러가 컴파일 시 자동으로 기본 생성자를 추가한다.
		
		//Student s = new Student();=> 생성자
		
		/*Student02 s = new Student02(5000);
		s.info();*/
		
		/*Student03 s = new Student03();
		s.getStudentInfo();
		
		Student03 s1 = new Student03("이순신");
		s1.getStudentInfo();
		
		Student03 s2 = new Student03("홍길동", 3);
		s2.getStudentInfo();*/
		
		/*Person p = new Person("장원영", 20);
		p.getPersonInfo();
		
		Person p1 = new Person("카리나", 21);
		p1.getPersonInfo();*/
		
		//생성자 오버로딩
		
		// 오버로딩
		// 클래스 이름을 재사용해서 여러개의 
		// 생성자가 존재하도록 만드는것을 생성자 오버로딩 이라고 합니다.
		
		// 오버로딩 도입이유
		// 생성자나 메서드의 이름을 재사용하기 위해 도입된 기능
		
		//생성자 오버로딩의 정의와 규칙
		//1. 클래스 이름을 재사용해서 여러 개의 생성자를 만들어서 사용하는것
		//2. 반드시 매개변수의 타입, 순서, 개수가 달라야한다.
		
		/*Phone p1 = new Phone("갤럭시", 1 ,"흰색");
		Phone p2 = new Phone("아이폰", 2);
		
		p1.phoneInfo();
		p2.phoneInfo();*/
		
		/*Book b = new Book();
		b.getBookInfo();
		
		Book b1 = new Book("멘토시리즈 자바");
		b1.getBookInfo();
		
		Book b2 = new Book("신데렐라", 170);
		b2.getBookInfo();
		
		Book b3 = new Book(5, "노인과 바다");
		b3.getBookInfo();*/
		/*Book b1 = new Book();
		System.out.println("b1.title : " + b1.title);
		System.out.println("b1.series : " + b1.series);
		System.out.println("b1.page : " + b1.page);
		
		Book b2 = new Book("멘토시리즈 자바");
		System.out.println("b2.title : " + b2.title);
		System.out.println("b2.series : " + b2.series);
		System.out.println("b2.page : " + b2.page);
		
		Book b3 = new Book("신데렐라", 170);
		System.out.println("b3.title : " + b3.title);
		System.out.println("b3.series : " + b3.series);
		System.out.println("b3.page : " + b3.page);
		
		Book b4 = new Book(5, "노인과 바다");
		System.out.println("b4.title : " + b4.title);
		System.out.println("b4.series : " + b4.series);
		System.out.println("b4.page : " + b4.page);*/
		
		//this.
		//this는 인스턴스 자신이 자기를 가리킬 때 사용하는 변수
		
		//용도 
		//1. 자신의 다른 생성자를 호출한
		//-생성자의 첫 줄에서 다른 생성자 호출
		//-this(), this(매개변수1....)
		
		//2. 자신의 필드 호출시 사용한다.
		//-지역변수(생성자 매개변수)와 필드명이 동일한 경우 필드명 앞에 붙여서 사용
		//-this.필드명
	}

}

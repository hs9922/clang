package CH9;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		//이름 : 홍길동
		//학년 : 3
		
		Student s = new Student(); //인스턴스 생성 후 참조 변수에 대입
		//. 이용해서 메모리에 생성된 Student 인스턴스 필드에 접근해서 변수값을 가지고 온다.
		String name = s.name;
		int grade = s.grade;
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);

		//값을 넣지 않아서 초기값이 나왔다. 이름 : null, 학년 : 0
		// String의 초기값은 null, int의 초기값은 0
		
		//인스턴스 필드의 값을 변경
		s.name = "홍길동";
		s.grade = 3;
		
		// 값 대입
		name = s.name;
		grade = s.grade;
		
		//출력
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		
	}
}

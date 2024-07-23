package CH134;

public class SuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 기본생성자 호출
		//College 생성자 호출
		Student s = new College("홍길동", 3 , 22 , "차범근");
		//Student 생성자 호출
		//Middle 클래스 생성자 호출
		Middle m = new Middle("이순신", 2 , "손흥민");
		
		String sinsang = s.getStudInfo();
		System.out.println("학생정보" + sinsang);
		//College 클래스의 getStudInfo() 메서드 호출
		//학생정보 : 이름은 홍길동, gkrsusdms 3, 신청학점은 22
		String teacher = s.getStudInfo();
		System.out.println(teacher);
		
		teacher = m.getStudInfo();
		System.out.println(teacher);
		//지도교수님 : 차범근
		//담임선생님 : 손흥민

	}

}

package it.exam.inheritance;

public class PersonMain2 {

	public static void main(String[] args) {
		
		//상속 관계에서의 클래스의 형변환
		
		//상속된 클래스는 상위 클래스 타입으로 객체 선언 가능
		Person st=new Student();
		
		//상위 클래스로 상속했을 경우, 부모가 지닌 기능만 사용 가능
		//st.setSchool("대한고등학교");//에러남
		
		//자기 자신 타입으로 변환-> 다운캐스팅
		Student me=(Student)st;
		
	}
}
 
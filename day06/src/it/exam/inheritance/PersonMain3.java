package it.exam.inheritance;

public class PersonMain3 {

	private static final int COMMON_FARE=800;
	
	public static void busfare(Person p) {
		int fare=0;
		if(p instanceof Student) {
			fare=COMMON_FARE-200;
			System.out.println("학생 요금은"+fare+"원 입니다.");
			
		}else if(p instanceof Employee) {
			fare=COMMON_FARE+200;
			System.out.println("일반 요금은"+fare+"원 입니다.");
		}
	}
	public static void main(String[] args) {
		
		Student st=new Student();
		st.setMyName("김철수");
		st.setAge(17);
		st.setGender("남자");
		st.setSchool("아이티고등학교"); 
		st.setGrade(1);
		
		Employee em=new Employee();
		
		em.setMyName("김기자");
		em.setAge(37);
		em.setGender("남자");
		em.setCompany("아이티신문사");
		em.setPosition("대리");
		
		busfare(st);  // 학생의 버스 요금을 계산하고 출력
        busfare(em);
	}
}

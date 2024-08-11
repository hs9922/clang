package it.exam.inheritance;

public class PersonMain {

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
		
		st.getInfo();
		
		em.getInfo();
	}
}

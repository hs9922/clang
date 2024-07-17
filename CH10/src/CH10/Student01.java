package CH10;
//기본생성자
public class Student01 {
	String name;
	int grade;
	
	//기본생성자
	public Student01()
	{
		
	}
	
	
	//학생 신상 정보 출력 메서드
	public void getStudentInfo()
	{
		System.out.println("이름: " + name + "학년: " + grade);
	}

}

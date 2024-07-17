package CH10;

public class Student03 {
	String name;
	int grade;
	
	//기본 생성자
	public Student03()
	{
		
	}
	
	//매개변수가 있는 생성자
	public Student03(String _name)
	{
		//필드에 있는 name에 매개변수 _name 대입
		name = _name;
	}
	
	//매개변수가 있는 생성자
	public Student03(String _name, int _grade) 
	{
		name = _name;
		grade = _grade;
	}
	
	//학생 신상 정보 출력 메서드
	public void getStudentInfo()
	{
		System.out.println("이름: " + name + ", 학년: " + grade);
	}


}

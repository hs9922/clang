package CH134;
//추상 클래스
public abstract class Student {
	
	String name;
	int grade;
	String teacher;
	
	public Student()
	{
		System.out.println("Student 기본 생성자 호출");
	}
	
	public Student(String name, int grade)
	{
		System.out.println("Student 매개변수가 있는 생성자 호출");
		this.name = name;
		this.grade = grade;
	}
	//반환값이 있는 메서드
	public String getStudInfo()
	{
		System.out.println("Student 클래스의 getStudInfo() 호출");
		return "이름 : " + name + "학년 : " + grade;
	}
	
	//추상 메서드
	public abstract String getTeacher();
}

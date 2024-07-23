package CH134;

public class Middle extends Student {
	
	public Middle(String name, int grade , String Teacher)
	{
		System.out.println("Middle 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	
	//추상 메서드 구현
	@Override
	public String getTeacher()
	{
		return "담임 선생님 : " + teacher;
	}

}

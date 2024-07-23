package CH134;

public class College extends Student {
	private int course;
	
	//추상클래스의 추상 메서드 구현
	@Override
	public String getTeacher()
	{
		return "지도 교수님 " + teacher;
	}

}

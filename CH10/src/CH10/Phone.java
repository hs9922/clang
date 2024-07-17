package CH10;

public class Phone {
	
	//오버로딩 실습
	//생성자 매개변수 부족
	String brand;
	int series;
	String color = "검은색"; //필드 기본값 초기화
	
	public Phone(String b, int s)
	{
		brand = b;
		series = s;
	}
	
	public Phone(String b, int s, String c)
	{
		brand = b;
		series = s;
		color = c;
	}
	
	
	void phoneInfo()
	{
		System.out.println(color + " " + brand + " " + series);
	}
}

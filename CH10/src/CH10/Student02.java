package CH10;
//매개변수가 있는 생성자
public class Student02 {
	int price;
	
	//기본 생성자
	public Student02(int p)
	{
		//생성자에 매개변수로 int p를 받아서 필드 price에 값을 대입
		price = p;
	}
	
	void info()
	{
		System.out.println("과자의 가격은" + price + "원 입니다.");
	}
}

package CH132;
//자식 클래스
public class Pasta extends Recipt{
	
	Pasta(String chef)
	{
		//부모클래스(추상클래스) 생성자 호출
		super(chef);
	}

	void makeSource()
	{
		System.out.println("파스타 소스를 만듭니다");
	}
}

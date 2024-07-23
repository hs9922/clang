package CH13;

//자식 클래스
public class Samsong extends Computer{
	
	@Override
	void powerOn()
	{
		super.powerOn();
		System.out.println("삼송");
	}

	
}

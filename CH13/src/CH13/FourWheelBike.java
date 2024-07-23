package CH13;
//자식 클래스
public class FourWheelBike extends Bike {
	
	public FourWheelBike(String riderName)
	{
		super(riderName);
	}

	@Override
	void info()
	{
		super.info(); 
	}
	
	
	void addWheel()
	{
		if(wheel == 2)
		{
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조바퀴를 부착함 ");			
		}
		else
		{
			System.out.println(riderName + "의 이미 보조바퀴 있음");
		}
	}

	
}

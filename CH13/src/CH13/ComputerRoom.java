package CH13;

public class ComputerRoom {
	
	//객체가 특정 클래스의 필드가 되면서, 하나의 부품처럼 사용될 수 있다.
	Samsong computer1;
	Samsong computer2;
	
	void allPowerOn()
	{
		computer1.powerOn();
		computer2.powerOn();
	}

	void allPowerOff()
	{
		computer1.powerOff();
		computer2.powerOff();
	}

}

package CH14;

//Car 인터페이스의 구현 클래스
public class Truck implements Car{
	@Override
	public void speedUp()
	{
		System.out.println("트럭이 속도를 높입니다");
	}
	@Override
	public void speedDown()
	{
		System.out.println("트럭이 속도를 낮춥니다");
	}
	@Override
	public void stop()
	{
		System.out.println("트럭이 정지합니다");
	}
}
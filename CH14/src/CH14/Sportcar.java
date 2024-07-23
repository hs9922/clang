package CH14;
// Car 인터페이스 구현 클래스
public class Sportcar implements Car{
	
	@Override
	public void speedUp()
	{
		System.out.println("스포츠카가 속도를 높입니다");
	}
	@Override
	public void speedDown()
	{
		System.out.println("스포츠카가 속도를 낮춥니다");
	}
	@Override
	public void stop()
	{
		System.out.println("스포츠카가 정지합니다");
	}

	//스포츠카가 가진 고유 메서드 
	public void turbo()
	{
		System.out.println("스포츠카 고속 질주 기능입니다");
	}
}

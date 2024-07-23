package CH133;

public class ThreeStarPhone extends Phone {
	//추상 클래스를 상속받았으면 무조건 추상메서드를 구현(완성)해줘야 한다.
	// 구현하지 않으면 에러
	@Override
	void openingLogo()
	{
		System.out.println("***");
	}
}

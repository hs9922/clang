package CH132;
//자식클래스
public class Stake extends Recipt{
	
	Stake(String chef)
	{
		super(chef);
	}
	
	void grillStake()
	{
		System.out.println("스테이크를 맛있게 굽습니다");
	}

}

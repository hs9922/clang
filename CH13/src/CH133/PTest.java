package CH133;

public class PTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실행결과
		//@@@
		//핸드폰 켜짐
		//핸드폰 꺼짐
		
		//***
		//핸드폰 켜짐
		//핸드폰 꺼짐
		
		PinapplePhone pp = new PinapplePhone();
		pp.PowerOn();
		pp.PowerOff();
		
		System.out.println();
		
		ThreeStarPhone tp = new ThreeStarPhone();
		tp.PowerOn();
		tp.PowerOff();
		
		//추상 클래스와 추상 메서드의 용도
		//자식 클래스 간의 공통적인 필드와 메서드 이름을 통일 할 수 있다.
		//반드시 구현해야 하는 메서드를 선언함으로써 공통 규격을 제공한다. 
		

	}

}

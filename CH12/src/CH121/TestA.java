package CH121;

class TA{}
class Tb extends TA{}

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//부모 객체 생성
		TA a1 = new TA();
		// 자식 객체 생성
		Tb b1 = new Tb();
		//new 사용해서 자동 타입 변환
		TA t1 = new Tb();
		//참조 변수를 사용해서 자동타입변환
		TA t2 = b1;
		//객체가 같은지 비교
		if(t2 == b1)
		{
			System.out.println("같은 객체 참조 하고 있음");
		}
		
	}

}

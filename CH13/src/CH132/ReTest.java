package CH132;

public class ReTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//부모를 추상 클래스로 만들었음.
		//Recipt r = new Recipt(); 추상클래스는 직접 객체를 생성할 수 없습니다.
		
		Pasta p = new Pasta("최연석");
		p.info(); // 자식 객체를 통해서 추상 클래스에 있는 메서드를 호출 할 수 있음
		p.makeSource();
		
		//추상클래스의 자식이기 때문에 추상클래스에 있는 메서드를 호출 할 수 있음
		Stake s = new Stake("이연복");
		s.info();
		s.grillStake();
	}

}

package CH9;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실행결과
		//wheel의 개수는 4개입니다.
		//wheel의 개수는 5개입니다.
		
		Car c = new Car();
		int wheel = c.wheel;
		System.out.println("wheel의 개수는 " + wheel + "개입니다.");
		c.wheel++;
		wheel = c.wheel;
		System.out.println("wheel의 개수는 " + wheel + "개입니다.");
	}

}


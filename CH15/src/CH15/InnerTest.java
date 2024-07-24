package CH15;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer("홍길동", 20);
		Outer.Inner i = o.new Inner("서울시 마포구");
		System.out.println("고객정보 >> " + i.getUserInfo());
		
	}

}

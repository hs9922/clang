package CH143;

public class ChildTestT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test()호출
		//method1()호출
		
		//구현 클래스 타입 변수는 모든 메서드를 호출할 수 있다.
		Child1 T = new Child1();
		T.test();
		T.method1();
		
		//업캐스팅 변수로 사용
		ITest3 i = new Child1();
		i.test(); // ITest3에 있는 메서드만 활용가능
		
		//다운캐스팅
		//하위 인터페이스로 다운캐스팅 후 접근 가능
		ITest4 i1 = (ITest4)i;
		i1.method1();
		
		/*ITest4 i4 = new Child1();
		i4.test();
		i4.method1();*/
		
	}

}

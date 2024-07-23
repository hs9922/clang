package CH141;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실행결과
		//method1() 호출
		//method2() 호출
		/*ITest1 i1 = new Child();
		ITest2 i2 = new Child();
		Child c =(Child)i1;
		Child c1 =(Child)i2;
		c.method1();
		c1.method2();*/
		Child c = new Child();
		c.method1();
		c.method2();
	}

}

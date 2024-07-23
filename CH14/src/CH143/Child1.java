package CH143;
//구현클래스
public class Child1 implements ITest3, ITest4{
	@Override
	public void test()
	{
		System.out.println("test() 호출");
	}
	
	@Override
	public void method1()
	{
		System.out.println("method1() 호출");
	}
}

package CH141;
//인터페이스를 완성시키기 위해 구현 클래스 생성
// 다중 상속 가능
public class Child implements ITest1, ITest2{
	@Override
	public void method1() 
	{
		System.out.println("method1 호출");
	}
	
	@Override
	public void method2() 
	{
		System.out.println("method2 호출");
	}
}

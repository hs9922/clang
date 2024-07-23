package CH13;

public class Bike {

	//클래스 강제 타입 변환 (다운캐스팅)
	//자식 객체가 부모 타입으로 자동 타입 변환 후, 다시 자식 타입으로 변환하는 것
	//자식 타입 변수 = (자식타입)부모타입
	
	String riderName;
	int wheel = 2;
	
	
	public Bike(String riderName) 
	{
		this.riderName = riderName;
	}
	
	void info()
	{
		System.out.println(riderName + "의 자전거는  " + wheel + "발 자전거 입니다");
	}
	
	void ride()
	{
		System.out.println("씽씽");
	}
}

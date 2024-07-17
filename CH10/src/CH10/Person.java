package CH10;

public class Person {
	//멤버 name, age
	
	//매개변수 2개인 생성자 만들기
	// 값 대입
	
	//introduce 함수 만들기
	//("안녕하세요 저는 " + age + "세" + name + "입니다");
	String name;
	int age;
	public Person(String _name, int _age) 
	{
		name = _name;
		age = _age;
	}
	public void getPersonInfo()
	{
		System.out.println(name + " " + age) ;
	}
}

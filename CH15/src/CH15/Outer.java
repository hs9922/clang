package CH15;

public class Outer {

	private String name;
	private int age;
	
	public Outer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	//내부클래스
	public class Inner{
	
		private String address;
		
		public Inner(String address)
		{
			this.address = address;
		}
		
		public String getUserInfo()
		{
			return "이름 : " + name + " / 나이 : " + age + " / 주소 : " + address;
		}
	}
}

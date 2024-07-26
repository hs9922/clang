package CH17;

class Car{
	private String carName;
	private String company;
	
	public Car(String carName, String company)
	{
		this.carName = carName;
		this.company = company;
	}
	
	@Override
	public String toString()
	{
		String str = "차량이름 : " + this.carName + " , 제조사 : " + this.company; 
		return str;		
	}
	
}

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("소나타", "현대");
		System.out.println(c);
	}

}

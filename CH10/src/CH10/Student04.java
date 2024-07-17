package CH10;

public class Student04 {
	
	//필드(전역변수)----------
	String name;
	int age;
	int studentID;
	//---------------
	
	public Student04(String name, int age, int studentID) //매개변수 
	{
		this.name = name;
		//this.필드명 = 매개변수

		this.age = age;
		this.studentID = studentID;
	}
}

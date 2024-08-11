package it.exam.inheritance;

public class Person {

	private String myName;
	
	private int age;
	
	private String gender;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	} 

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//정보 출력
	public void getInfo() {
		System.out.println("이름:"+this.getMyName()+",나이:"+this.getAge()+",성별:"+this.getGender());
	}
}

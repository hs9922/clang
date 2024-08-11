package it.exam.obj;

public class Car {
	
	private String myName;
	
	public Car(String myName) {
		this.setMyName(myName);
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
}

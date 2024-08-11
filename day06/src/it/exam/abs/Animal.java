package it.exam.abs;

public abstract class Animal {

	private String myName;
	private String eat;
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	
	//추상화 메서드
	public abstract void getHunting();
}

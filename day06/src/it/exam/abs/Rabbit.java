package it.exam.abs;

public class Rabbit extends Animal {
	
	@Override
	public void getHunting() {
		System.out.println("토끼는 껑충껑충 뛰어서 "+this.getEat()+"을 먹습니다.");
	}
}

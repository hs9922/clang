package it.exam.abs;

public class Tiger extends Animal{

	@Override
	public void getHunting() {
		System.out.println("호랑이는 어흥~하며 "+this.getEat()+"을 먹습니다.");
	}

}

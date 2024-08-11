package it.exam.abs;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal tiger=new Tiger();
		Animal rabbit =new Rabbit();
		
		tiger.setMyName("티거");
		tiger.setEat("사슴고기");
		
		rabbit.setEat("당근");
		rabbit.setMyName("레빗");
		
		tiger.getHunting();
		rabbit.getHunting();

	}

}

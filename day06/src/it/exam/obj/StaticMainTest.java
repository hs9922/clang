package it.exam.obj;

public class StaticMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적변수는 클래스 이름으로 호출 간으
		System.out.println("원주율:"+ StaticTest.PI);
		
		//정적메서드도 클래스 이름으로 호출
		System.out.println("원 넓이:"+StaticTest.circleWidth(7));

	} 

}

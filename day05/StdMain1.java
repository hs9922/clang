package day05;

public class StdMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체를 사용하기 위해서 선언한다.
		Student std1 = new Student();
		Student std2 = new Student();
		
		//변수에 값을 입력하기.
		std1.myName="김영수";
		std1.myAge=30;
		
		std2.myName="김영희";
		std2.myAge=30;
		
		//출력
		System.out.println(std1.getMyInfo());
		System.out.println(std2.getMyInfo());
	}

}

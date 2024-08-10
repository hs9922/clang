
package day05;

public class StdMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 st1=new Student3();
		//생성자 오버로드를 이용하여 객체를 선언할 때 데이터 주입
		Student3 st2=new Student3("김명수",34);
		
		st1.setMyName("홍길동");
		st1.setMyAge(100);
		
	
		
		System.out.println(st1.getMyInfo());
		System.out.println(st2.getMyInfo());
	}

}

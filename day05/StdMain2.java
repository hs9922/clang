
package day05;

public class StdMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 st1=new Student2();
		Student2 st2=new Student2();
		
		st1.setMyName("홍길동");
		st1.setMyAge(100);
		
		st2.setMyName("김명수");
		st2.setMyAge(30);
		
		System.out.println(st1.getMyInfo());
		System.out.println(st2.getMyInfo());
	}

}

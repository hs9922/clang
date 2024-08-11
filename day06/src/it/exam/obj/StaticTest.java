package it.exam.obj;

public class StaticTest {

	private final int num=10;
	//정적변수는 대부분 상수로써 사용한다.
	//상수란 공유하되 변경 불가한 값을 의미
	//상수는 final 기호를 붙인다.
	//상수는 모든 이름을 대문자로 기입한다.
	//2음절 이상일 경우 각 음절을 언더바(_)를 사용하여 이어붙인다.
	public static final double PI=3.14;
	 
	
	public double cal() {
		return num+PI;
	}

	//일반 변수나 메서드는 정적 메서드내에서 사용 불가
	//정적 변수나 메서드는 this 키워드 안된다.
	//this는 클래스 자신을 뜻하지만 객체화 된 자기자신 즉 인스턴스를 의미하기 때문
	public static double circleWidth(int num) {
		return num*PI;
	}
}

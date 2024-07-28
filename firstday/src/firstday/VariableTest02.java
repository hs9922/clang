package firstday;

public class VariableTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 타입별 크기		정수(byte < short < int < long) < 실수 (float < double)
		//정수타입 변수
		byte bOne =10;
		int num01 = 100;
		long lnValue =20;
		int sum = 0;
		
		//실수
		double doVal = 30.123;
		float ff = 30.12f;
		
		//문자
		char ch01 = 'A';
		
		//문자열
		String str = "안녕"; // String이 클래스인 이유 자바는 단일 문자열 처리를 하기 힘든데  String이 클래스여서 문자열 처리를 쉽게 데이터 처리하게 해줌
		
		//자동형 변환 : 조치없이 자동으로 되는것 int a = b;
		//강제형 변환 : 대입하려는 변수의 데이터 타입을 지정하여 변환시킴 //int a =(int) b;
	}

}

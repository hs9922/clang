package CH17;
//자바 API 문서 (Application Programming Interface)
// 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말하며 라이브러리라고도 부른다.

//Object : 자바 클래스의 최상위 클래스로 사용
//System : 시스템의 입/출력 장치로부터 데이터를 입력받거나 출력하기 위해 사용
//String : 문자열을 저장하고 여러가지 정보를 얻을 때 사용
// String Buffer/ StringBuilder 문자열을 저장하고 내부 문자열을 조작할 때 사용
// Math : 수학 함수를 이용할 때  

// == : 기본 데이터들의 비교를 위해서 사용
// 객체를 동등 비교할 경우, 해당 객체의 값을 비교하는것이 아니라 객체의 '메모리'에 있는 위치를 비교


//hashCode() : 주민등록번호처럼 객체를 식별하는 하나의 정수값을 'hashCode'라고 핟ㄴ다.
//			   이는 객체마다 고유한 값을 가지게 되고 hashCode는 그것을 반환하는 메서드이다.

//toString()
//toStirng 메서드는 객체의 문자 정보를 반환해주는 클래스
// print문을 사용해 객체를 출력할 경우, 해당 메서드가 자동으로 실행되어 객체의 정보를 반환해주고 출력된다.
// 해당 메서드를 재정의 해서 사용하면 원하는 객체의 정보를 쉽게 출력할 수 있다.

// Object obj = new Object();
// System.out.println(obj);

//toString 메서드를 재정의하여 객체의 정보를 반환
public class CH17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str1 = "hello";
		String str2 = "hello";
		String str3 = "apple";
		
		//String 객체가 객체의 비교를 위해 Object가 제공하는 hashCode()메서드를 ovrride하여 사용하고 있음
		System.out.println("str1 hashCode : " + str1.hashCode());
		System.out.println("str2 hashCode : " + str2.hashCode());
		System.out.println("str3 hashCode : " + str3.hashCode());*/
		
		//문자열 변수 비교
		/*System.out.println("str1 vs str2  : "  + (str1 == str2));
		System.out.println("str1 vs str2  : "  + (str2 == str3));
		
		// 각 문자열 변수가 있는 위치값 출력
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));*/
		
		/*System.out.println("str1 vs str3 : " + (str1.equals(str3)));
		System.out.println("str2 vs str3 : " + (str2.equals(str3)));*/
	}

}

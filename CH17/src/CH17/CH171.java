package CH17;
//String 클래스는 문자열을 처리하는 객체형 데이터 타입.

//메서드
//int length() :문자열 길이 반환
//char charAt() : 문자열을 하나의 단어 단위로 출력 (파라미터로는 추출할 문자열의 위치를 받음) = 매개변수
//int indexOf(String ch) : 문자열에 포함된 단어 또는 문자열의 위치를 앞에서부터 검색했을 때
//int indextOf(int ch) : 일치하는 위치의 인덱스 값을 반환(없을경우 -1을 반환)
	
//String substring(int beginIndex) : 문자열을 원하는 위치에서 자를 때 사용, 입력된 시작 위치부터 문자열의 마지막까지 반환
//String substring(int beginIndex, int endIndex) : 문자열을 입력 시작 위치부터 마지막 위치 전까지의 값을 리턴
//				   (0,5) => 0,1,2,3,4

//replaceAll 메서드는 특정 문자 및 문자열을 원하는 단어로 변경해주는 메서드
//replaceAll(변경 대상, 변경할 단어); //문법

//StringBuilder가 지닌 대표적인 메서드
//append(String str) : 기존 문자열 뒤에 더하여 변환
//delete(int start, int ed) : 시작 위치 전부터 끝 위치 전까지 삭제
//insert(int offset, String str) : 시작 위치부터 문자열 삽입
//reverse() : 문자열을 반대로 출력

//Math클래스
//Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스

//int abs(int a)			: 절대값 계산
//double abs(double a)		: 절대값 계산	

//double ceil(double a) : 올림계산
//double floor(double a) : 버림계산

//double round(double a) : 반올림 계산

//int max(), double max() : 최댓값을 구하는 계산
// int min(), double min() : 최솟값을 구하는 계산

// double random() : 랜덤값을 반환

public class CH171 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String word = "1I2LOVE6YOU";
		
		//문자열에서 숫자를 찾아 제거하고 문자열만 출력할 수 있는 변수 생성
		String text = "";
		
		for(int i=0; i<word.length(); i++)
		{
			//charAt(index) 메서드는 문자열을 하나의 문자로 각각반환
			char ch = word.charAt(i);
			
			int ascciNum = ch; //문자를 아스키코드에 의한 10진수 값으로 변환
			
			//소문자 a~z 97~122, 대문자 65~90사이
			if((ascciNum >= 65 && ascciNum <= 90) || (ascciNum >= 97 && ascciNum <= 122))
			{
				text +=ch;
			}
			else
			{
				text += " ";
			}
		}
	
		System.out.println(text);*/
		/*String str = "HelloWorld MyWorld";
		
		//처음위치에서 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World"));
		
		//10번째 위치부터 시작하여 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World",10));*/
		
		/*String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재밌습니다";
		String newStr = str.replace("자바", "Java");
		System.out.println(str);
		System.out.println(newStr);*/
		
		//문자열 선언
		/*String str = "1234-5687";
		
		//4번째 위치부터 문장끝까지 가져온다.
		String substr = str.substring(5);
		
		System.out.println("4번째 위치 추출 : " + substr);
		
		String rangeStr = str.substring(0,4);
		System.out.println("범위 내 추출 : " + rangeStr);*/
		
		/*StringBuilder str = new StringBuilder("Hello");
		
		//기존 문자열 뒤에 삽입
		str.append(" world");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		//문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		//원하는 위치에 문자열 삽입
		str.insert(0, "Hello ");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		//문자를 반대로 출력
		str.reverse();
		System.out.println(str);*/
		//올림
		//	주어진 숫자보다 크거나 같은 가장 작은 정수로 반환, 즉, 숫자를 올림하여 정수로 만듦
		System.out.println("3.51 올림 : " + Math.ceil(3.51));
		//내림 // 주어진 숫자보다 작거나 같은 가장 큰 정수를 반환. 즉, 숫자를 버림하여 정수로 만듦.
		System.out.println("13.61 버림 : " + Math.floor(13.61));
		//반올림
		System.out.println("12.8 반올림 : " + Math.round(12.8));
		
		//절대값
		System.out.println("절대값 " + Math.abs(-4.55));
		
		//최댓값 구하기
		int maxValue = Math.max(30, 60);
		System.out.println("가장 큰값 : " + maxValue);
		
		//최솟값 구하기
		int minValue = Math.min(30, 60);
		System.out.println("가장 작은값 : " + minValue);
		
		//랜덤 :
		int randValue = (int)(Math.random()*30);
		//-> 0<=x && <=30
		System.out.println(randValue);
		
	}

}

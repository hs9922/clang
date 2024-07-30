package CH19;

//인터페이스 StrTransForm // 인터페이스에서 같은 이름을 가진 두 개 이상의 메서드를 정의 할 수 없다.
interface StrTransForm{
String transform(String str1, String str2);
}
public class CH193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스를 람다식으로 구현
		 StrTransForm  strTransForm = (str1,str2) ->
		{return "result : " + str1 + "-" + str2;};
		
		//System.out.println(strTransForm.transform("java", "programming"));
		//두 문자열을 변환하여 결과를 반환
		String result = strTransForm.transform("java", "programming");
		
		System.out.println(result);
		//결과 출력
		//결과 : Result : java - programming
	}

}

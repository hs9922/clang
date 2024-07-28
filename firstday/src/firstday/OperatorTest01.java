package firstday;

public class OperatorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 10;
		byte b = 20;
		int num01 = 10;
		long num02 = 20;
		
		//int 이하끼리 더하면 결과는 int로 나온다.
		//byte bsum = a + b;
		int intSum = a + b;
		//연산대상에 int보다 큰 타입이 있다면 그 중 제일 큰 타입이 결과 타입
		//int Sum = num01 + num02;
		long lnSum = num01 + num02;
		
		//문자열 연산 + 기호 >> 결합의 의미
		// "안녕 " + "잘가" =>"안녕 잘가";
		
		//증감연산
		int target = 10;
		int sum = 0;
		//증감연산자가 변수 뒤에 있으면, 수식 이후 연산 된다.
		sum = target++;
		System.out.println("sum = " + sum +", target = " + target);
		
		
		//증감연산자가 앞에 있는 경우, 수식이 일어나기 전에 증감한다.
		sum = ++target;
		System.out.println("sum = " + sum +", target = " + target);
	}

}

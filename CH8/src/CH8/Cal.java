package CH8;

public class Cal {
	//매개변수가 2개 이상인 메서드 정의
	
	//return
	// 메서드를 호출할 때 매개변수를 전달해 준 것 처럼, 필요에 따라 메서드로부터 실행한 결과값을 되돌려 받을 수 있다.
	// 반환타입 : 메서드를 호출했을 때 결과값으로 돌려받을 데이터의 자료형을 명시
	// 예를 들어, sum()이라는 함수 결과값으로 정수를 돌려 받는 다면 반환타입으로 int를 작성해야 한다.
	
	// void로 선언하지 않은 이유는 반환 값이 있는 메서드를 정의 하기 때문이다.
	// return은 반환값이 있음으로 결과값을 돌려받을 데이터 자료형 int를 명시한 것이다.
	public int sum(int[] nums)
	{
		int result = 0;
		
		for(int i = 0; i <nums.length; i++)
		{
			result += nums[i];
		}
		
		return result;
		// 매개변수로 받은 값을 모두 더한 result 값을 다시 반환
	}
	/*void Sum(int num1, int num2)
	{
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다");
	}*/
}

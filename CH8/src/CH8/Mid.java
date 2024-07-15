package CH8;

public class Mid {
	
	public int score(int[] scores)
	{
		int result = 0;
		for(int i = 0; i< scores.length; i++)
		{
			result += scores[i];
		}
		
		return result;
		// return의 두번째 기능
		// 해당 메서드를 그 즉시 종료시켜주는 역할도 한다.
		// 그래서 return 뒤에는 실행 코드를 적지 않는다.
		
		//System.out.println(result); //컴파일 에러
	}

}

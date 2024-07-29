package CH16;
import java.util.Scanner;
//임의의 예외 처리 방법
// 프로그램의 규칙에 위배되어 예외를 발생해야 할 경우, 임의로 예외를 발생시킬 수 있다.

//throw 키워드
// 정의 : 예외 발생 상황이 아니더라도, 필요에 따라 강제로 예외를 발생시키는 기능
// 발생 방법 : throw new 예외객체(메시지)
//			예시 : throw new Exception
//			예시 : throw new InputErrorException 
// 발생 위치 : try-catch 내부 또는 메서드에 예외 던지기가 있는 경우
//	용도 : 개발자가 예외를 의도하는 위치

// 사용자 정의 예외 처리
//----------------------------
// 개발자의 목적에 의해서 예외 객체를 만들 수 있으며,
// 이를 사용할 수 있다
public class THTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		
		int val = 0;
		
		while(true)
		{
			try {
				System.out.println("숫자를 입력하세요(0~50) : ");
				val = sc.nextInt();
				
				if(val == -1)
				{
					break;
				}
				else if(val < 0 || val > 50)
				{
					//임의의 예외 발생
					throw new Exception("숫자의 허용범위가 아닙니다.");
				}
			}
			catch(Exception e)
			{
				sc.nextLine(); // 라인 단위 스트링 쓰기 및 버퍼 지우기
				System.out.println("에러 메시지 : " + e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("종료");*/
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("당신의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		
		if(age < 0)
		{
			//1미만인 경우 입력 실패
			throw new InputErrorException("입력이 잘못 되었습니다.");
		}
		
		if(age > 19)
		{
			System.out.println("성인입니다");
		}
		
		else if(age > 13)
		{
			System.out.println("청소년입니다");
		}
		
		else if(age > 6)
		{
			System.out.println("어린이입니다");
		}
		
		else
		{
			System.out.println("아동입니다");
		}
		}
		catch(InputErrorException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
		if(sc != null)
			{
			sc.close();
			}
		}
			
	}

}

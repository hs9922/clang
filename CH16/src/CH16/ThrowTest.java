package CH16;
import java.util.Scanner;
import java.util.InputMismatchException;
//예외 던지기
// 메서드 내부에서 예외를 처리하지 않고 미룬 후, 해당 메서드를 호출한 쪽에서 예외를 처리하도록 하는 방법
// 우린 그걸 "예외 던지기" 또는 "예외의 전가"라고 이야기한다.

//throws키워드
// 메서드 뒤에 throws 키워드를 사용하여 던지기 할 예외 객체를 붙여주면 된다.

// try-catch문을 써도 될텐데 왜 써요?
// 그 이유는 메서드에서 예외를 각가 처리하면 메서드 자체의 코드가 길어지거나,
// 유지 보수 측면에서 효율이 떨어질 수 있다.

public class ThrowTest {

	//성격 유형 검사를 위한 메서드
	public static void checkYourSelf (Scanner scan) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.println("선택 >>");
		int check = scan.nextInt();
		
		//성격 체크 후 출력
		if(check == 1)
		{
			System.out.println("당신은 ENFP");
		}
		else if(check == 2)
		{
			System.out.println("ISFP");
		}
		else
		{
			System.out.println("지정된 번호 내에서 입력해주세요");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스캐너 선언
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("======성격 유형 검사를 시작합니다======");
			//메서드 호출
			ThrowTest.checkYourSelf(sc);
			//클래스이름.throws 함수이름(매개변수 값);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("키보드 입력이 잘못 되었습니다.");
		}
		finally
		{
			if(sc != null)
			{
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//throws와 try-catch문을 같이 쓴 이유
	// 코드 안전성과 예외 처리
	// 예외 처리는 코드의 안전성을 높이고 예측할 수 없는 상황에서 어플리케이션이 안정적으로 동작하도록 한다.
	// throws 문으로 예외를 던지고 try-catch 문을 통해 예외를 처리하는 방식은 예외 상황에 대한 명확한 제어가 가능하다.
	

}

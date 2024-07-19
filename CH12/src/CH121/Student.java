package CH121;

//다형성 : 클래스 상속 구조에서 부모 클래스 타입 참조 변수가 자식 클래스의 객체를 가리킬 수 있는 기능 
//		  부모 클래스이름 참조변수 = 자식클래스 타입 변수;
//			부모변수 = 자식객체;
// 업캐스팅(upcasting) : 부모 <- 자식;

// 다형성 : 상위 클래스 타입으로 여러 다른 하위 클래스의 객체를 다룰 수 있는 능력
// 오버라이딩 + 상속 = 다형성

class teacher{}
class Students extends teacher{}

public class Student {
	public static void main(String[] args)
	{
		/*//부모 클래스 객체 생성
		teacher c1 = new teacher();
		
		//자식 클래스 객체 생성
		Students s1 = new Students();
		
		//업캐스팅 (부모 <- 자식) : 자동형 변환
		//자동 타입 변환
		teacher t1 = new Students();
		
		//자동 타입 변환
		teacher t2 = s1;
		
		//오류가 나는 코드 (자식 <- 부모) x 자동 타입 변환 불가
		//Students s2 =c1;
		
		if(t2 == s1)
		{
			System.out.println("같은 객체 참조 하고 있음");
		}*/
	}

}


package CH8;

public class CH8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//per에 있는 int age 변수 값 수정하기
		Per p = new Per();
		p.setAge(-30);
		p.setAge(30);
		System.out.println("내 나이는 " + p.getAge()+ "세 입니다.");
		
		// 배열 생성
		/*int[] nums = {500,200};
		//객체 생성
		Cal c = new Cal();
		//cal 객체의 sum 메서드를 호출하여 return된 결과 값을 출력
		System.out.println("숫자들의 합은 " + c.sum(nums) + "입니다");*/
		
		/*int[] studentA = {97,53};
		int[] studentB = {95,66};
		
		
		Mid mid = new Mid();
		//메서드를 호출한 결과값을 sumA에 저장
		int sumA = mid.score(studentA);
		
		//메서드를 호출한 결과값을 sumB에 저장
		int sumB = mid.score(studentB);
		
		if (sumA > sumB)
		{
			System.out.println("A학생의 중간고사 총점이 더 높습니다");
		}
		else if (sumA < sumB)
		{
			System.out.println("B학생의 중간고사 총점이 더 높습니다");
		}
		else 
		{
			System.out.println("두 학생의 중간고사 총점은 같습니다");
		}*/
		
		//문제 
		/*직육면체 가로, 세로, 높이를 입력받아 부피를 리턴하는 메서드 구현하기
		직육면체		가로		세로		높이
		직육면체1		가로		세로		높이
		직육면체2		가로		세로		높이
		직육면체3		가로		세로		높이*/
		//객체 생성
		/*Run r = new Run();
		r.running();
		
		r.name ="김나비";
	
		// sayName 호출하기
		r.sayName();*/
		/*Book bo = new Book();
		bo.count(3);*/
		/*Cal c = new Cal();
		c.Sum(3, 5);
		c.Sum(9, 8);*/
		/*Person p = new Person();
		p.in("홍길동", 20);
		p.hello();*/
	}
	
	
	//매개 변수
	//특정 기능을 수행하기 위한 메서드는 기능을 수행할 때 사용할 인수를 받을 수 있다.
	// 우리는 그것을 "매개변수"라고 이야기 한다.
	
	/*접근제한자 반환타입 메서드이름(자료형 변수명)=>매개변수
	 *  메서드를 호출할 때 같이 전달받는 변수를 메서드 안에서 사용할 지역변수에 담는 것
	 {
	 }
	 */
	

	//static : 정적 멤버로 선언
	// 프로그램 시작과 동시에 메모리에 올라감
	/*static void Hello()
	{
		System.out.println("안녕하세요");	//안녕하세요 출력.
	}*/
	
	
	
	
	
	
	
	//접근 제한자 : 변수와 마찬가지로 해당 메서드에 접근할 수 있는 범위
	// public : 모든 클래스에서 접근 가능
	
	// 반환타입 (return type)
	// 메서드를 호출하면 메서드 블록 안에 있는 코드들을 실행한 후 결과값을 반환 하는데,
	// 어떤 타입으로 반환할 것인지 타입을 미리 정해준다,
	// 반환값이 없을 때 void
	
	// 메서드 이름 : 변수처럼 이름을 가지고, 메서드를 호출할 때 사용합니다.
	
}

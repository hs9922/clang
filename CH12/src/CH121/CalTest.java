package CH121;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실행결과
		
		//보라색 달력은 6월까지 있습니다.
		//보라색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.
		//보라색 달력을 책상에 세울 수 없습니다.
		
		DeskCalendar d = new DeskCalendar("보라색", 6);
		
		d.info();
		d.hang();
		d.onTheDesk();
		//줄바꿈 코드
		System.out.print("\n");
		//검은색 달력은 12월까지 있습니다.
		//검은색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.
		//자동 타입 변환
		//업캐스팅
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hang();
		//부모클래스 참조변수에 자식 클래스 객체가 들어가 있기 때문에
		//부모 클래스에 있는 메서드 사용은 가능하나 오버라이드가 안된 메서드는 사용이 불가능하다.
		//c.onTheDesk();
		//DeskCalendar d = new DeskCalendar() 따로 해야됨
		
	}
}

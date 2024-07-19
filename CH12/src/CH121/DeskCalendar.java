package CH121;
//Calendar의 자식 클래스
public class DeskCalendar extends Calendar {

	//자식 클래스 생성자(매개변수)
	public DeskCalendar(String color, int month)
	{
		// Calender 생성자 호출
		super(color, month);
	}
	
	//hang오버라이딩
	@Override
	public void hang()
	{
		System.out.println(color+ " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다."); 
	}
	
	public void onTheDesk()
	{
		System.out.println(color + " 달력을 책상에 세울 수 없습니다.");
	}
}

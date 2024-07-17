package CH10;

public class Book {
	//title = "제목없음"
	String title = "제목없음";
	//series = 1;
	int series = 1;
	//page = 100;
	int page = 100;
	
	//기본 생성자
	public Book()
	{
		
	}
	
	//매개변수1 String t 생성자
	// title = t
	public Book(String t) 
	{
		title = t;
	}
	
	// 매개변수2 String t, int p 생성자
	// title = t
	// page = p
	public Book(String t, int p) 
	{
		title = t;
		page = p;
	}
	// 매개변수2 int s, String t 생성자
	// series = s
	// title = t
	public Book(int s, String t) 
	{
		series = s;
		title = t;
	}
	public void getBookInfo()
	{
		System.out.println("title : " + title);
		System.out.println("series : " + series);
		System.out.println("page : " + page);
	}
}

package CH10;

public class Phone12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 후 매개변수 전달("어린왕자", 300);
		Book03 b = new Book03("어린왕자", 300);
		System.out.println(b.title +" " + b.page);
	}

}

class Book03{
	String title;
	int page;
	
	//생성자 (타이틀, 페이지 매개변수)
	public Book03(String title, int page)
	{
		//this키워드 사용해서 값 대입
		this.title = title;
		this.page = page;
	}
}

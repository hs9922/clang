package CH15;

//외부클래스
class Library{
	private String name;
	
	//생성자(String name)
	public Library(String name)
	{
		this.name = name;
	}
	//초기화
	/*public void libraryInfo()
	{
		System.out.println("도서관 이름 : " + name);
	}*/
	
	//모든 자바 클래스는 기본적으로 'Object' 클래스를 상속 받고 있다.
	//'toString' 오버라이드
	// 객체 정보를 문자열로 반환하는 용도
	// 이 클래스의 객체를 문자열로 표현할 때 사용
	@Override
	public String toString()
	{
		return "도서관 이름 : " + name;
	}
	
	//정적 내부 클래스
	public static class Book{
		// private String title
		private String title;
		public Book(String title)
		{
			this.title = title;
		}
		public void displayInfo()
		{
			System.out.println("책 제목 : " + title);
		}
	}
	
}





public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library("나의 도서관");
		//l.libraryInfo();
		System.out.println(l);
		Library.Book t = new Library.Book("자바 프로그래밍 입문");
		t.displayInfo();
		
	}

}

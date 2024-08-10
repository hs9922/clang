package day05;

public class Student3 {

	//변수
	private	String myName;
	private	int myAge;
	
	//기본생성자
	public Student3() {}
	//생성자 오버로드
	public Student3(String myName, int myAge) {
		this.setMyName(myName);
		this.setMyAge(myAge);
	}
	//setter
	public void setMyName(String myName) {
		this.myName=myName;
	}
	
	//getter
	public String getMyName() {
		return this.myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
	//메서드
		public String getMyInfo(){
			return "나는 "+this.getMyName()+"이고, 나이는 "+this.getMyAge()+"입니다.";
		}

}

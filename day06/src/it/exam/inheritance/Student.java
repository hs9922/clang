package it.exam.inheritance;

public class Student extends Person {
	
	private String school;
	private int grade;
	
	public Student() {
		//부모생성자가 호출됨
		super(); 
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//annotation>>클래스나 메서드에 기능 또는 역할, 상태 등을 부여한다.
	//유일하게 생략이 가능한 annotation은 @Override이다.
	@Override
	public void getInfo() {
		System.out.println("이름:"+this.getMyName()+",나이:"+this.getAge()+",성별:"+this.getGender());
		System.out.println("학교:"+this.getSchool()+",학년:"+this.getGrade());
	}

}

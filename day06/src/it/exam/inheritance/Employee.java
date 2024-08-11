package it.exam.inheritance;

public class Employee extends Person{
	
	private String company;
	private String position;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public void getInfo() {
		System.out.println("이름:"+this.getMyName()+",나이:"+this.getAge()+",성별:"+this.getGender());
		System.out.println("회사:"+this.getCompany()+",직급:"+this.getPosition());
	}
	
	
}

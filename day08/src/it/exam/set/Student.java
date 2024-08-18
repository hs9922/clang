package it.exam.set;

public class Student {
	private String stdCode;
	private String myName;
	
	public Student(String stdCode, String myName) {
		this.myName=myName;
		this.stdCode=stdCode;
	}
	
	public String getStdCode() {
		return this.stdCode;
	}
	
	public String getMyName() {
		return this.myName;
	}
	
	//비교를 위한 hashcode
	@Override
	public int hashCode() {
		System.out.println("hashcode 비교");
		return stdCode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("학번 비교");
		if(!(obj instanceof Student)) {
			return false;
		}
		
		Student comp=(Student)obj;
		
		return this.getStdCode().equals(comp.getStdCode());
	}
	
}

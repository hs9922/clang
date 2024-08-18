package it.exam.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1=new Student("st1001","김홍도");
		Student st2=new Student("st1001","김홍도");
		Student st3=new Student("st1002","김홍도");
		
		Set<Student>set=new HashSet<>();
		
		set.add(st1);
		set.add(st2);
		set.add(st3);
		
		System.out.println("크기:"+set.size());
		
		for(Student st:set) {
			System.out.println("학번:"+st.getStdCode()+"이름:"+st.getMyName());
		}
		
	}

}

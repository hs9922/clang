package it.exam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		
		Set<Integer>set01=new HashSet<>();
		
		set01.add(1);
		set01.add(1);
		set01.add(1);
		set01.add(2);
		set01.add(3);
		set01.add(4);
		
		
		//삭제>remove(값);
		set01.remove(1);
		
		System.out.println("크기:"+set01.size());
		
		//존재 여부 contains(값);
		System.out.println(set01.contains(4));
		
		//출력1-foreach
		for(int value:set01) {
			System.out.println(value);
		}
		System.out.println("=====================================");
		
		//출력2-iterator이용
		Iterator<Integer>iter=set01.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}

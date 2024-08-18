package it.exam.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortBasicMain {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		Random rand=new Random();
		
		for(int i=0;i<5;i++) {
			int value=rand.nextInt(30)+1;
			list.add(value);
		}
		
		System.out.println("정렬 전:"+list);
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println("오름차순 정렬 후:"+list);
		
		//내림차순 정렬
		Collections.sort(list,Comparator.reverseOrder());
		
		System.out.println("내림차순 정렬 후:"+list);

	}

}

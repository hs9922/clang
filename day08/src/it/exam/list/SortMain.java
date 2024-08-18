package it.exam.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortMain {

	public static void main(String[] args) {

		List<Number> list=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			//랜덤 클래스
			Random rand=new Random();
			//nextInt(값); 0<=x<값;
			int value=rand.nextInt(30)+1;
			Number n=new Number(value);
			list.add(n);
		}

		System.out.println("정렬 전");
		for(int i=0;i<5;i++) {
			System.out.print(list.get(i).getValue()+" ");
		}
		System.out.println();
		
		//정렬
		Collections.sort(list,new NumberCompare());
		System.out.println("정렬 후");
		
		for(int i=0; i<5; i++) {
			System.out.print(list.get(i).getValue()+" ");
		}
		System.out.println();
	}

}

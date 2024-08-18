package it.exam.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortMain2 {

	public static void main(String[] args) {

		List<Number2> list=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			//랜덤 클래스
			Random rand=new Random();
			//nextInt(값); 0<=x<값;
			int value=rand.nextInt(30)+1;
			Number2 n=new Number2(value);
			list.add(n);
		}

		System.out.println("정렬 전");
		for(int i=0;i<5;i++) {
			System.out.print(list.get(i).getValue()+" ");
		}
		System.out.println();
		
		//정렬
		Collections.sort(list);
		System.out.println("정렬 후");
		
		for(int i=0; i<5; i++) {
			System.out.print(list.get(i).getValue()+" ");
		}
		System.out.println();
	}

}

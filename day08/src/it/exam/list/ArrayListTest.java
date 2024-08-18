package it.exam.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//선언
		List<Integer> list=new ArrayList<>();
		
		//추가-add(data);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		//중간 삽입add(index,data);
		list.add(3,10);
		
		//치환-set(index,data);
		list.set(0,11);
		
		//존재여부 판단-contains(data);
		System.out.println(list.contains(10));
		System.out.println(list.contains(6));
		
		//삭제 remove(index), clear()<전체 삭제
		list.remove(4);
		list.remove(1);
		
		//출력1 단순 출력
		System.out.println(list);
		
		//출력2>get(index);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("======================================");
		
		//출력3>향상된 for문을 이용한다.-for each문이라고도 한다.
		//for(데이터 담을 변수 선언:loop 대상)
		for(int value:list) {
			System.out.println(value);
		}
		
		System.out.println("======================================");
		
		//출력4>> iterator를 이용한 출력
		//iterator란 collection 그룹에 존재하는 반복자
		//iterator는 자료구조 안에 있는 데이터를 검색하여 반환한다.
		Iterator<Integer> iter=list.iterator();
		//hasNext()>>꺼낼 대상이 존재하는지 검색
		while(iter.hasNext()) {
			//현위치 데이터를 반환 후 이동
			System.out.println(iter.next());
		}
		
	}

}

package it.exam.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer,String>map=new HashMap<>();
		
		//삽입 put(key, value);
		map.put(1, "one");
		map.put(1, "하나");
		
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		//중간 삽입, 삭제 없음
		
		//치환-> 키중복을 이용한 업데이트
		map.put(1, "하나");
		
		//삭제 remove(key)
		map.remove(5);
		
		//존재 여부-key
		System.out.println(map.containsKey(2));
		//존재 여부-value
		System.out.println(map.containsValue(15));
		
		//출력1-key를 이용한 출력
		Set<Integer>keys=map.keySet();
		
		for(int key: keys) {
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		
		System.out.println("===================================================");
		
		Set<Entry<Integer,String>>entrySet=map.entrySet();
		
		for(Entry<Integer,String> entry:entrySet) {
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
	}

}

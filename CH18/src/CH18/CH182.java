package CH18;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Iterator 	: 반복하다
//List 컬렉션의 요소를 순회하여 하나씩 추출하는데 사용

//메서드			                          기능설명
//boolean hashNext()    다음에 순회할 데이터 유무확인 / 가져올 객체가 있으면 true, 없으면 false;
// E next() 			다음 위치의 데이터로 이동하여 반환



public class CH182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터를 List로 만들어 반환
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//반복자 객체 가져오기
		//List의 반복자 객체를 가져오기
		Iterator<Integer> it = list.iterator();
		
		int count = 0;
		
		//반환할 요소가 있는지 확인
		while(it.hasNext())
		{
			//요소 반환
			int val = it.next();
			System.out.println("list데이터 [ " + (count++) + " ] : " + val);
		}
		
		
		
	}

}

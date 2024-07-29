package CH18;

import java.util.HashSet;
// Set : 수학의 집합과 유사하고 저장 순서 저장하지 않음
//	중복 허용 불가능
// index 부여하지 않음

//HashSet클래스는 Set 컬렉션 클래스에서 가장 많이 사용되는 클래스로 인터페이스를 상속받아 구현

public class CH181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet 생성
		HashSet<String> set = new HashSet<>();
		
		//요소 추가
		set.add("사과");
		set.add("바나나");
		set.add("체리");
		
		//중복된 요소 추가 시도
		set.add("바나나");
		
		//요소 출력
		// Set은 순서를 보장하지 않는다.
		System.out.println(set);
		
		set.remove("바나나");
		set.remove("체리");
		
		System.out.println(set);
		
	}

}

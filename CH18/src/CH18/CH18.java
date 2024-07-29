package CH18;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

//Java Collection Framework
// 자료 구조 종류의 형태들을 자바 클래스로 구현한 모음집

//컬렉션 프레임워크 장점
//1. 인터페이스와 다형성을 이용한 객체지향적 설계를 통해 표준화 되어 있기 때문에, 사용법만 익히기에도 편리하고 재사용성이 높다.
//2. 데이터 구조 및 알고리즘의 고성능 구현을 제공하여 프로그램의 성능과 품질을 향상시킨다.
//3. 관련 없는 API간의 상호 운용성을 제공한다(상위 인터페이스 타입으로 업캐스팅 하여 사용)
//4. 이미 구현되어 있는 API를 사용하면 되기에, 새로운 API를 익히고 설계하는 시간이 줄어든다. 

//List와 Set은 인터페이스는 모두 컬렉션 인터페이스를 상속받지만, Map 인터페이스는 구조상의 차이로 별도로 정의

//List 순서가 있는 데이터 집합		                    데이터 중복 허용o
//Set 순서가 없는 데이터 집합                          데이터 중복 허용x		
//Map 키(key) - 값(Value)의 쌍으로 이루어진 데이터 집합	순서 유지x, 키 중복x, 값 중복x



//List컬렉션 : 배열과 마찬가지로 index로 요소에 접근
// 리스트와 배열의 가장 큰 차이는 리스트는 자료형 크기가 고정이 아닌 데이터 양에 따라 동적으로 늘어났다 줄어들 수 있다는 점(가변);
//요소 사이에 빈 공간을 허용하지 않아 삽입/삭제 할 때마다 배열 이동이 일어난다.

// ArrayList클래스
// 배열을 이용하여 만든 리스트
// 데이터량에 따라 공간이 자동으로 늘어나거나 줄어든다
// 단반향 포인터 구조로 자료에 대한 순차적인 접근에 강점이 있어서 '조회가 빠르다'
// 삽입/삭제가 느리다.	=> 순차적으로 추가/삭제 하는 경우에는 가장 빠르다

// 선언하는 방법
// List<데이터타입> 변수 = new ArrayList<데이터타입>();

// 메서드					   동작		   기능설명
//void add(E e)			   삽입		   데이터를 순차적으로 삽입
//void add(int index, E e) 중간 삽입 	   원하는 index 위치에 삽입
//void set(int index, E e) 치환 	  	   원하는 index 위치에 치환
//E get(int index) 		   반환		   선택된 index 위치의 값 반환
//void remove(int index)   삭제         선택된 index 위치의 값 삭제
// void clear()            전체 삭제      모든 데이터 삭제
// int size()              크기          저장된 데이터의 개수 반환
// boolean contains(Object c) 검색       데이터 존재 여부 확인


public class CH18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//리스트 선언
		/*List<String> list =new ArrayList<>();
		
		//데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		System.out.println("리스트 내용 : " + list);
		
		//3번째 위치에 삽입
		list.add(2, "수박");
		
		System.out.println("리스트 내용 : " + list);*/
		
		//리스트 선언 및 초기화
		/*List<String> list = new ArrayList<>(); // 리스트 내용 "사과,배,오렌지,키위,블루베리"
		
		list.add("사과");
		list.add("배");
		list.add("오렌지");
		list.add("키위");
		list.add("블루베리");
		
		System.out.println("리스트 내용1 : " + list);
		
		list.add(3, "포도");//4번째 위치 포도 삽입
		
		System.out.println("리스트 내용2 : " + list);*/
		
		//
		/*List<String> u = new ArrayList<>();
		
		u.add("딸기");
		u.add("바나나");
		u.add("망고");
			
		System.out.println("리스트 내용1 : " + u);
		
		//데이터 변환
		u.set(1, "복숭아");
		u.set(0, "딸기");
		
		System.out.println("리스트 내용2 : " + u);*/
		
		//ArrayList 데이터 삭제
		/*List<Integer> list = new ArrayList<>();
		
		//2의 배수를 넣는다
		for(int i = 1 ; i < 10 ; i ++)
		{
			int temp = 2*i; //2*1, 2*2, ..... 2*9
			list.add(temp);
		}
		System.out.println("리스트 내용 : " + list);
		
		//3번째 인덱스 내용 삭제
		list.remove(3);
		//숫자 타입의 데이터는 객체화 후 삭제
		list.remove(Integer.valueOf(10));
		
		System.out.println("리스트 내용2 : " + list);*/
		
		//ArrayList 데이터 얻기
		// E get(int index) 메서드를 이용해 원하는 인덱스 위치에 저장되어 있는 값을 출력
		// 
		/*List<Integer> list = new ArrayList<>();
		
		//List에 랜덤 함수를 이용해 값넣기
		for(int i = 1 ; i < 10 ; i++)
		{
			int temp = (int)(Math.random()*30)+1;
			list.add(temp);
		}
		
		System.out.println("전체 데이터 : " +list);
		
		//List에 담긴 데이터를 짝수만 출력하기
		System.out.println("짝수 : ");
		for(int i = 0; i < list.size() ; i++)
		{
			//List에서 각 index위치하는 값 가져오기
			int value = list.get(i);
			//짝수 판별
			if(value %2 == 0)
			{
				System.out.print(value + " ");
			}
		}*/
		
		//LinkedList : 노드(데이터 + 주소)를 연결하여 리스트처럼 만든 컬렉션(배열이 아님)
		// 데이터의 중간 삽입, 삭제가 빈번할 경우 빠른 성능을 보장
		
		//하지만 임의의 요소에 대한 접근성능은 좋지 않다.
		
		//자바 LinkedList는 양방향 포인터 구조로 이루어져 있다.
		//LinkedList는 리스트 용도 이외에도, 스택, 큐, 트리의 자료구조의 근간이 된다.
		
		//ArrayList 선언
		ArrayList<Integer> arr = new ArrayList<>();
		
		//LinkedList 선언
		LinkedList<Integer> link = new LinkedList<>();
		
		//ArrayList 연속으로 데이터 추가
		long startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++)
		{
			arr.add(i);
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList 추가시간 : " + duration);
		
		
		//LinkedList 연속으로 데이터 추가
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++)
		{
			link.add(i);
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList 추가시간 : " + duration);
		
		//ArrayList의 경우 연속성 있게 데이터를 추가할 경우 ArrayList가 더 빠름
		
		//ArrayList 중간 삽입
		startTime = System.nanoTime();
		arr.add(99, 100);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList 삽입시간 : " + duration);
		
		//LinkedList 중간 삽입
		startTime = System.nanoTime();
		link.add(99, 100);
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList 삽입시간 : " + duration);
	}

}

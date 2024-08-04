package day03;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[]arr=new int[10];
        
		//배열에 값을 넣는다
		for(int i=0; i<arr.length; i++) {
		//arr[index]=값;
			arr[i]=(int)(Math.random()*50)+1;
		}
		System.out.println("오름차순 정렬 전: " +Arrays.toString(arr));
		
		//정렬
		int temp=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {//arr.length-1인 이유: arr[j+1]이 존재하므로 또한 i가 반복되는 과정에서 마지막반복은 의미가 없으니 -i
				//오름차순은 앞의 수가 뒤보다 작아야하기 때문에 크다면 앞뒤 변경
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
			//자동 임포트:ctrl+shift+o(영어)
		}System.out.println("오름차순 정렬 후: "+Arrays.toString(arr));
			
	}

}

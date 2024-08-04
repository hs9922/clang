package day03;

import java.util.Arrays;

public class DuplicatedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr=new int[10];
		
		//배열에 값을 넣는다
		for(int i=0; i<arr.length; i++) {
			//arr[index]=값;
			arr[i]=(int)(Math.random()*10)+1;
			
			//중복체크
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;//증감식에서 증가하니까 하나빼야 제자리
					break;
				}
			}
		}System.out.println("정렬 후 :" +Arrays.toString(arr));

	}

}

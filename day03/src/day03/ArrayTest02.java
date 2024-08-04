package day03;

import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr=new int[10];
		
		//배열에 값을 넣는다.
		for(int i=0; i<arr.length; i++) {
			//arr[index]=값;
			arr[i]=(int)(Math.random()*50)+1;
		}
		
		//배열은 도우미 클래스인 Arrays가 존재합니다.
		//도우미 클래스를 이용하면 쉽게 출력도 가능
		System.out.println(Arrays.toString(arr));
		
		
		//배열에서 짝수를 찾아서 더해보세요.
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
				System.out.print(arr[i] +" ");
			}
		}
		System.out.println("\n짝수 합:" + sum);
	
	}
	

}

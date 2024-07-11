package CH6;

import java.util.Arrays;
import java.util.Comparator;

public class CH6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//버블 정렬 예제
		// 정렬해야 할 배열
		/*int[] arr = {1,6,2,3,10,7,4,5,8,9};
		
		// 값을 치환하기 위한 변수
		int temp = 0;
		
		for(int i = arr.length - 1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i; j++)
			{
				//
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 출력");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}*/
		
		//Array클래스의 기능 활용
		
		/*Integer[] arr = {1,6,2,3,7,4,5,8,9};
		
		System.out.println(Arrays.toString(arr));
		
		//배열 항목을 정렬해주는 Arrays.sort()기능
		//Arrays.sort(arr);
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
		
		//sort는 오름차순
		// Comparator.reverseOrder() : 내림차순 / 주의점은 Integer*/
		
		// 얕은 복사 : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경
		// 깊은 복사 : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 바뀌지 않음

		//얕은 복사 예제
		/*int[] arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		//arr02 = {1,2,3};
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		
		//arro2배열 값 변경
		arr02[1] = 10;
		//arr02 = {1,10,3};
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr02));
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		*/
		
		//다른 클래스의 도움을 받지 않고 기본적으로 가능한 깊은 복사
		//새로운 배열을 생성하여 복사
		/*int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];
		
		//새로운 배열에 기존 내용 삽입
		for(int i = 0; i < card.length ; i++)
		{
			newCard[i] = card[i];
		}
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));*/
		
		//Arrays 클래스를 이용한 깊은 복사
		/*int[] card = {3,1,4,5,10};
		
		//배열의 깊은 복사 - Arrays.copyOf(복사 대상, 복사 길이)
		int[] newCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		
		//card 배열 값 변경
		card[1] = 10;
		// card[1] = {3,10,4,5,10};
		
		//출력
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard)); // {3,1,4,5,10}*/
		
		//System 클래스를 이용한 깊은 복사
		/*int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];
		
		//(복사 대상 배열, 복사 시작 위치, 카피할 배열, 시작위치, 복사할 길이);
		System.arraycopy(card, 0, newCard, 0, card.length);
		
		System.out.println("card 배열" + Arrays.toString(card));
		System.out.println("newCard 배열" + Arrays.toString(newCard));*/
		
		// 다차원 배열
		// 다차원 배열 선언 방법
		//int[][] arr = new int[크기(행)][크기(열)];
		//int[][] arr = new int[크기(행)][]; // 열을 지정하지 않고 선언할 수 있다.
		
		//2차원 배열 활용하기
		/*int[][] score1 = new int[3][3];
		int[][] score2 ={{10,20,30},{40,50,60},{70,80,90}};
		
		//에러가 나는 코드
		// int[][] score3;
		// score3 = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("score1 배열 값 출력");
		System.out.print(score1[0][0] + " ");
		System.out.print(score1[0][1] + " ");
		System.out.print(score1[0][2] + " ");
		
		System.out.println();
		
		System.out.println("score2 배열 값 출력");
		System.out.print(score2[0][0] + " ");
		System.out.print(score2[0][1] + " ");
		System.out.println(score2[0][2] + " ");
		System.out.print(score2[1][0] + " ");
		System.out.print(score2[1][1] + " ");
		System.out.println(score2[1][2] + " ");
		System.out.print(score2[2][0] + " ");
		System.out.print(score2[2][1] + " ");
		System.out.print(score2[2][2] + " ");*/
		
		//2차원 배열 길이 알아보기
		/*int[][] score1 = {{10,20,30},{40,50,60},{70,80,90}};*/
		
		//1차원 배열 길이
		/*System.out.println("score1 1차원 요소 길이 " + score1.length);
		//2차원 배열 길이
		System.out.println("score1 2차원 요소 길이 " + score1[0].length);
		System.out.println("score1 2차원 요소 길이 " + score1[1].length);
		System.out.println("score1 2차원 요소 길이 " + score1[2].length);*/
		
		/*int[][] score2 = {{10,20,30},{40,50,60}};
		//1차원 요소 길이 : 2
		// 2차원 요소 길이 : 3
		// 2차원 요소 길이 : 3
		System.out.println("score2 1차원 요소 길이 " + score2.length);
		System.out.println("score2 2차원 요소 길이 " + score2[0].length);
		System.out.println("score2 2차원 요소 길이 " + score2[1].length);*/
		
		//2차원 배열을 활용한 예제
		
		/*int[][] arr= new int[5][5];
		int count = 1;*/
		
		//1부터 25까지 차례대로 배열에 값을 넣는다.
		//이중 for문 활용
		
		
		//배열 출력
		//이중 for문 활용
		
		//실행 결과
		/*1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25 //45분까지*/
		
		
		/*for (int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = count++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }*/
        
		
		int[][] matA = {{2,3,5},{6,7,8},{9,10,11}};
		
		int[][] matB = {{1,4,7},{13,3,2},{3,9,20}};
		
		int[][] matC = new int[matA.length][matA[0].length];
		
		//두 행렬의 합 구하기
		//이중 for문 사용
		//두 행렬 합 출력
		//이중 for문
		System.out.println("A 행렬");
		for (int i = 0; i < matC.length; i++)// 행
		{
            for (int j = 0; j < matC[i].length; j++)// 열 
            {
               System.out.print(matA[i][j] + " ");
            }
           System.out.println();
		}
		System.out.println("B 행렬");
		for (int i = 0; i < matC.length; i++)// 행
		{
            for (int j = 0; j < matC[i].length; j++)// 열 
            {
               System.out.print(matB[i][j] + " ");
            }
           System.out.println();
		}
       System.out.println("두 행렬의 합");
		for (int i = 0; i < matC.length; i++)// 행
		{
            for (int j = 0; j < matC[i].length; j++)// 열 
            {
                matC[i][j] = matA[i][j] + matB[i][j];
                System.out.print(matC[i][j] + " ");
                // matC[0][0] = matA[0][0] + matB[0][0]
                // matC[0][0] = 2 + 1 = 3
                
                // matC[0][1] = matA[0][1] + matB[0][1]
                // matC[0][1] = 3 + 4 = 7
            }
            System.out.println();
		}
		
		
		
	}

}

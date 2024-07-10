package CH5;

import java.util.Scanner;
public class CH5 {

	public static void main(String[] args) {
		// TODO Auto-gernerated method stub
		
		//배열
		// 같은 자료형의 변수를 지정하여 '여러 데이터를 저장할 수 있는 공간'
		// 이렇게 여러 데이터를 담을 수 있는 구조를 자료구조(data structure)라고도 합니다.
		
		// 배열 선언 방법(문법)
		// < 자료형[] 변수이름; => int[] arr;>
		// 자료형 변수이름[]; => int arr[];
		// 대괄호[]는 배열의 연산자
		
		// null => 비어있다.
		// int num;
		
		
		//배열 생성
		//<int[] arr = new int[배열의 크기]>
		//int arr[] = new int[배열의 크기
		
		//int(자료형) [](대활호) = new(배열을 신규 생성) int [](배열의 크기);
		
		// int a = 5
		// int a;
		// a = 5
		
		// [잘못된 방법]
		// int[] arr;
		// arr = {1,2,3,4,5};
		
		// int[] arr; 
		// arr = new int[] {1,2,3,4,5};
		
		// 배열 사용하는 예제
		
		/*int[] score = new int[5];
		
		//배열의 인덱스는 0부터 시작하기 때문에 0번부터 값을 넣어준다.
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		//score[5] = 100; 잘못된 코드
		//score[0] = 50.5; 잘못된 코드

		//배열 선언과 동시에 값들로 초기화
		//1. int[] score = new int[]{50,60,70,80,90};
		//2. int[] score = {50,60,70,80,90};
		
		System.out.println("Score[0] = " + score[0]);
		System.out.println("Score[1] = " + score[1]);
		System.out.println("Score[2] = " + score[2]);
		System.out.println("Score[3] = " + score[3]);
		System.out.println("Score[4] = " + score[4]);
		
		//총점
		int total = score[0] + score[1] + score[2] + score[3] + score[4]; 
		
		//평균
		double avg = total / 5.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);*/
		
		
		//미션!
		
		//4개의 공간을 가진 배열 선언
		//배열의 값 넣기
		// 1,2,3,4
		
		// 실행결과
		/*arr[0] = 1
		arr[1] = 2
		arr[2] = 3
		arr[3] = 4*/
		
		/*int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);*/
		
		//배열의 길이
		// 문법
		// 배열명.length

		/*int[] score = {50,60,70,80,90};
		String[] name = {"카리나", "윈터", "닝닝", "지젤"};
		
		//배열의 길이 출력
		System.out.println("score의 배열 길이 : " + score.length);
		System.out.println("name의 배열 길이 : " + name.length);*/
		
		//배열 선언과 초기값
		
		//5개의 공간을 가지는 배열 선언
		/*int[] intArray = new int[5];
		String[] strArray = new  String[5];
		
		//5개의 값을 가지는 배열 선언
		int[] varArray = {1,2,3,4,5};
		
		//intArray 의 첫번째 값 출력
		System.out.println("intArray[0] = " + intArray[0]);
		
		//strArray의 첫번째 값 출력
		System.out.println("strArray[0] = " + strArray[0]);
		
		//varArray의 첫번째 값 출력
		System.out.println("varArray[0] = " + varArray[0]);*/
		
		//--------------------------------------------------------
		
		//배열을 이용해서 짝수의 합 구하기
		// 실행 결과:
		// 짝수 값들
		// 배열의 짝수들의 합 :

		//10개의 배열 선언
		/*int[] numbers = new int[10];
		
		//배열에 랜덤 함수를 이용해 값을 입력
		for(int i = 0; i< numbers.length; i++)
		{
			//랜덤 함수를 이용해 각 배열의 위치에 값을 저장
			numbers[i] = (int)(Math.random() * 30) + 1;
		}
		
		//배열 안에서 짝수만 구해서 합 구하기
		int sum = 0;
		for(int i = 0; i< numbers.length; i++)
		{
			//짝수라면
			if(numbers[i] %2 == 0)
			{
				sum += numbers[i];
			}
			
		}
		for(int i = 0; i < numbers.length; i++)
		{
			//numbers배열의 랜덤값 출력
			System.out.print(numbers[i] +" ");
		}
		
		//줄 바꾸기 코드
		System.out.println();
		
		//합 구하기
		System.out.println("짝수들의 합" + sum);*/
		
		//배열에서 단어만 추출하여 출력
		
		//단일 문자 배열에 단어와 숫자를 섞어 넣기
		/*char[] cards = {'1', 'L', 'O', '2', 'V', '3','E'};
		String myWord = "";
		for(int i = 0; i< cards.length; i++)
		{
			//문자는 아스키코드표에 의해 10진수 숫자를 대응한다.
			int word = cards[i];
			// 65~90 사이는 대문자 A~Z
			// 또는 97~122 사이는 소문자 a~z
			if((word >= 65 && word <= 90) || (word >=97 && word <= 122))
			{
				myWord += (char)word;
			}
		}
		
		System.out.println("단어 : " + myWord);*/
		
		//학생 키 입력받아서 배열에 저장하기
		//실행결과
		//키 정보를 입력해 주세요.
		//145.6
		//177.8
		//166.9
		//188.5
		//167.8
		// 평균키 : 169.32
		
		// 5개의 배열 공간 선언
		/*double[] height = new double[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키 정보를 입력해 주세요. ");
		
		//배열의 인덱스로 사용할 변수
		int stdNum = 0;
		String temp = null;
		
		while(stdNum < height.length)
		{
			//입력 받은 값을 temp에 저장
			temp = sc.nextLine();
			
			//temp값은 string으로 받았기 때문에 double.parseDouble로 형변환을 현다.
			height[stdNum] = Double.parseDouble(temp);
			
			stdNum++;
		}
		double total = height[0] + height[1] + height[2] + height[3] + height[4];
		double avg = total / (double)height.length;
		System.out.println("평균키 : " + avg);*/
		
		//for문으로 배열 다루기
		//10개의 배열 선언

		//score[0] = 0
		//score[1] = 1
		//...//score[9] = 9
		
		/*int[] score = new int[10];
		for(int i = 0; i < score.length; i++)
		{
			score[i] = i;
			System.out.println("score [" + i + "] = " + score[i]);
		}
		
		String[] name = {"안녕", "쉬는시간", "10분"};
		for(int i = 0; i< name.length; i++) {
			System.out.println("name [" + i + "] = " + name[i]);
		}*/
		
		//요점 정리
		// 배열은 같은 타입의 데이터를 편리하게 다루는 방법이다.
		// 배열은 new 연산자를 이용하거나 값 목록으로 초기화해서 생성한다.
		// int[] arr = new int[4]; (new 연산자 사용)
		// String[] name = {"안녕", "쉬는시간", "10분"}; (값 목록으로 초기화)
		//배열은 인덱스를 이용해서 각 요소에 접근한다. student[0], [1]
		// 배열의 첫번째 인덱스는 0으로 시작한다.
		// 배열명.length를 통해서 배열의 길이를 얻을 수 있다.
		// 배열 length에서 벗어나면 에러가 발생한다.
		
		//배열의 오름차순으로 정렬하기
		// 실행결과
		// 정렬 전 배열값
		// 5	4	3	2	1
		// 정렬 후 배열 값
		// 1	2	3	4	5
		
		/*int[] num = {5,4,3,2,1};
		int temp = 0;
		
		System.out.println("정렬 전 배열값");
		//정렬 전 배열 값 출력하기 위한 for문
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		
		//오름차순 정렬
		for(int i=0; i< num.length; i++)
		{
			for(int j = i+1 ; j < num.length; j++)
			{
				if(num[i] > num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 배열값");
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}*/
		
		//for문으로 배열 요소의 합 구하기
		//10개의 배열 만들기
		int[] score = new int[10];
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
		{
			score[i] = i*10 + 10;
		}
		
		//for문을 이용해서 배열 요소의 값들을 sum에 누적
		for(int i = 0; i< score.length; i++)
		{
			sum += score[i];
		}
		
		System.out.println("배열 요소들의 합: " + sum);
			
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

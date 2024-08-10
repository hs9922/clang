package day05;

import java.util.Arrays;
import java.util.Scanner;

public class MyLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 컴퓨터가 뽑은 로또 번호+보너스 번호
		//2. 사용자가 입력하는 로또번호
		//3.비교
		//4.출력
		
		//시스템 로또 ㅐ열
		int[]lotto=new int[6];
		//보너스번호
		int bonusNumber=0;
		int[]balls=new int[45];
		
		//1~45개 공을 넣는다.
		for(int i=0; i<45; i++) {
			balls[i]=(i+1);
		}
		
		//로또를 추첨하자
		int count=0;
		
		while(count<7) {
			//index 위치를 랜덤함수를 이용해서 생성(0~44)
			int randindex=(int)(Math.random()*45);
			//해당 위치의 값이 0이라면 이미 뽑힌 번호
			if(balls[randindex]==0) {
			continue;
			}
			
			//count가 6이라면 로또번호는 다 출력했으니 보너스 처리
			if(count==6) {
				bonusNumber=balls[randindex];
			}else {
				lotto[count]=balls[randindex];
				//뽑은 위치에 0을 넣는다.
				balls[randindex]=0;
			}
			//공을 뽑았으니 카운트 증가
			count++;
		}
		
		System.out.println("로또:"+Arrays.toString(lotto)+" 보너스 번호:"+bonusNumber);
		
		//사용자 로또 만들기
		Scanner scan=new Scanner(System.in);
		//카운트 초기화
		count=0;
		int[]userLotto=new int[6];
		
		while(count<6) {
			System.out.println((count+1)+"번째 로또 입력:");
			int number = scan.nextInt();
			
			//입력 유효값 확인
			if(number<1||number>45) {
				System.out.println("로또번호는 1에서 45사이만 입력가능합니다.");
				continue;
			}
			
			//로또에 입력한 숫자 넣기 //count=1/lotto[1]=number>count=2
			userLotto[count++]=number;
			
			//현재 위치 이전과 현재 값을 비교하여 중복이 있으면 처리
			for(int i=0; i<(count-1); i++) {
				if(userLotto[i]==number) {
					System.out.println(number+"는 이미 선택된 번호입니다.");
					count--;
					break;
				}
			}
		}scan.close();
		System.out.println("내 로또:"+Arrays.toString(userLotto));
		//맞은 번호를 저장할 배열
		int[] winNumbers=new int[6];
		int winCount=0;
		boolean isBonus=false;
		for(int i=0; i<userLotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(userLotto[i]==lotto[j]) {
					winNumbers[winCount++]=userLotto[i];
					break;//j루프 종료
				}
			}
			
			//보너스 번호 찾기
			if(!isBonus) {
				if(userLotto[i]==bonusNumber) {
					isBonus=true;
				}
			}
		}
		
		System.out.print("맞은 로또 번호:[");
		for(int i=0; i<winCount; i++) {
			System.out.print(winNumbers[i]);
			if(i<(winCount-1)) {
				System.out.print(",");
			}
		}System.out.print("]");
		
		System.out.println(winCount==5&&isBonus?"보너스번호:"+bonusNumber:"");
		
		if(winCount==6) {
			System.out.println("대박!!로또1등");
		}else if(winCount==5&&isBonus) {
			System.out.println("우와!! 로또2등");
		}else if(winCount==5) {
			System.out.println("축하!! 로또3등");
		}else if(winCount==4) {
			System.out.println("로또 4등!!");
		}else if(winCount==3) {
			System.out.println("운이좋네요! 로또5등");
		}else {
			System.out.println("낙첨... 다음에는 1등!");
		}
		
	}

}

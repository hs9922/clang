package day03;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  8/10 까지 숙제1
		/* 1                    *
		 * 2				   ***			
		 * 3                  *****
		 * 4                 *******
		 * 5                *********
		 * 6                 *******
		 * 7                  *****
		 * 8                   ***
		 * 9                    *
		 * 
		 * 별 찍기
		 * 9x9
		 */
		for(int i=0; i<=4; i++) {//i를 0부터 4까지 반복
			for(int j=0; j<9; j++) {//j를 0부터 8까지 반복
				if(j<4-i||j>4+i) {//j가4-i 보다 작거나 또는 4+i보다 클경우 실행 
					System.out.print(" ");//공백 출력
				}
				else {
					System.out.print("*");//별 출력
				}	
			}
			System.out.println();//줄 바꿈	
		}//여기까지 1에서 5행까지 삼각형
		for(int i=0; i<=3; i++) {//i를 0부터 3까지 반복
			for(int j=0; j<9; j++) {//j를 0부터 8까지 반복
				if(j>i&&j<=7-i) {//j가 i보다 크면서 7-i이하일 경우 실행
					System.out.print("*");//별 출력
				}
				else {
					System.out.print(" ");//공백 출력
				}	
			}
			System.out.println();//줄 바꿈
		}//여기까지 6행부터 9행까지 역삼각형
		
		//숙제2 로또 만들기
		/* 컴퓨터:1에서 45번까지의 번호중 6개 숫자 + 1개 보너스 번호 뽑기 Random함수를 사용하여 값 입력
		 * 모든 숫자는 중복이 없다.
		 *
		 * 사용자:6개의 번호를 선택(1~45까지의 숫자중) Scanner를 사용하여 입력
		 * 1등 6개 모두 동일
		 * 2등 5개 + 보너스번호포함
		 * 3등 5개
		 * 4등 4개
		 * 5등 3개
		 * 나머지 꽝
		 * 
		 * 비교
		 * 출력 결과 
		 * 맞은 번호: 27,31,30....
		 * 등수:
		 * 
		 */
	}

}

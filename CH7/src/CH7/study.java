package CH7;

import java.util.Scanner;

import java.util.Arrays;

public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);

	    System.out.print("시험 점수를 입력하세요: ");
	    int score = sc.nextInt();
	    char grade;*/
	    	
        /*if (score >= 90 && 90 <=100) {
            grade = 'A';
        } else if (score >= 80 ) {
            grade = 'B';
        } else if (score >= 70 ) {
            grade = 'C';
        } else if (score >= 60 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);*/
	    /*System.out.println((score>=90)? "A" : (score>=80)? "B" : (score>=70)? "C" : (score>=60)? "D" : "F");*/
		//문제 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하세요
		/*Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = sc.nextInt();
		 
		if (year % 400 == 0) {
			System.out.println("1");
		} else if (year % 4 == 0 && year % 100 != 0) {
            		System.out.println("1");
            	}
            else {
            	System.out.println("0");
            }
		
		//좌표를 입력 받았을때 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오*/
		/*Scanner sc = new Scanner(System.in);
		System.out.print("좌표를 입력하시오");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0) {
        	System.out.println("원점입니다.");
        }
        else if (x > 0) 
        {
        	if(y > 0) 
        	{
            System.out.println("1");
        	}
        	else  
        	{
            System.out.println("4");
        	}
        }
        else 
        { 
        	if(y < 0) 
        	{
            System.out.println("2");
        	}
        	else 
        	{
            System.out.println("3");
        	}
        }*/
		//문제: 시간 H시 M분을 설정 했을때 설정한 시간 보다 45분 빠르게 알람이 설정되는 
		//프로그램을 작성하시오(입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0이고 끝은 23.59이다)
		//불필요한 0은 사용하지 않는다
		Scanner sc = new Scanner(System.in);
		System.out.println("알람을 설정하시오");
		
		int H = sc.nextInt();
        int M = sc.nextInt();
       
        /*int total = H * 60 + M; 
        total -= 45;
        
        if (total < 0) {
            total += (24*60);
        }

        int newH = total / 60;
        int newM = total % 60;
        System.out.println("실제 설정 시간: " + newH + " " + newM);*/ //내가 한 답
        
        //만약 분이 45분 미만이라면
        if(M <45)
        {
        	//시간에서 1을 빼줌
        	H--;
        	//분 조정
        	M = 60 - (45-M);
        	
        	//만약 시간이 음수가 되면
        	if(H < 0)
        	{
        		// 시간을 23으로 설정(자정)
        		H = 23;
        	}
        	// 결과 출력
        	System.out.println(H + " " + M);
        }
        // 분이 45분 이상일 경우
        else
        {
        	System.out.println(H + " " + (M-45));
        }
	}

}

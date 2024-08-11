package it.exam.homework;

public class DiamondExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int line=9;
		int half = line/2;
		int space=half;//공백 칸
		int lineStep=(half+1);//전체 칸수
		
		for(int i=0; i<line; i++) {
			
			if(i>0&&i<=half) {
				space--;
				lineStep++;
			}else if(i>0&&i>half){
				space++;
				lineStep--;
			}
			
			//별과 공백을 찍는j
			for(int j=0; j<lineStep; j++) {
				if(j<space) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
	}

}

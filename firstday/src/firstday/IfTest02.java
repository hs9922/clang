package firstday;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*((100-60)+1))+60;//(int)(Math.random()*((최댓값-최솟값)+1))+최솟값//랜덤 문법
		
		if(score >= 70) {
			System.out.println("합격입니다. " + score);
		}else {
			System.out.println("불합격입니다." + score);
		}
		
	}
	
	
	

}

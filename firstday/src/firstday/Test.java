package firstday;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int score = (int)(Math.random()*(100-40+1))+40;
	
	if(score >= 90) {
		System.out.println("A: " + score);
		
	}else if(score >= 80){
		System.out.println("B: " + score);
		
	}else if(score >= 70){
		System.out.println("C: " + score);
		
	}else if(score >= 60){
		System.out.println("D: " + score);
		
	}else{
		System.out.println("F: " + score);
	}
	
}

}

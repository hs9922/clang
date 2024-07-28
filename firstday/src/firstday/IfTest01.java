package firstday;

public class IfTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 3000;
		
		if(money >= 1000) {
			System.out.println("택시 타고 간다.");
		}
		
		//if - else 문 > 참일 때와 아닐 때의 조건을 작성한다.
		if(money >= 4000) {
			System.out.println("택시 타고 간다.");
		}else {
			//참이 아닐 경우 코드가 실행된다.
			System.out.println("버스 타고 간다.");
		}
		
		//if - else if > 여러 조건으 부여하여 결과를 얻는다.
		if(money >= 4000) {
			System.out.println("택시 타고 간다.");
			
		}else if(money >= 2000){
			System.out.println("버스 타고 간다.");
			
		}else if(money >= 1000) {
			System.out.println("따릉이를 탄다.");
			
		}else {
			System.out.println("걸어간다.");
		}
	
	}
}

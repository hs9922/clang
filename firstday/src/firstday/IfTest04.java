package firstday;

public class IfTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gender = "여성";
		int age = 21;
		
		//AND && >> 두 조건이 모두 참이어야 결과가 참 이다.
		//OR || >> 두 조건 중 하나라도 참이면 결과가 참 이다.
		
		if(age >= 20 && gender.equals("남자")) {
			System.out.println("당신은 성인이고 남자입니다.");
		}else {
			System.out.println("당신은 성인이 아니거나 여성이거나 혹은 그 둘다 입니다.");
		}
		
		int money = 3000;
		boolean isCard = false;
		
		if(money>=5000 || isCard == true) {
			System.out.println("택시를 탈 수 있다.");
		}else if(money>=3000) {
			System.out.println("버스를 탈 수 있다.");
		}else {
			System.out.println("걸어가야 한다.");
		}
		
		int myAge = 21;
		boolean	isArmy = true;
		gender = "남자";
		
		if (myAge >= 20 && gender.equals("남자")) {
			//중첩 if문은 if문안에 또 다른 조건을 넣는 것
			if(isArmy) {
				System.out.println("군필자");
			}else {
				System.out.println("미필자");
			}
		}
			
		
	}

}

package CH8;

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫번째 직육면체 출력
		int width1 = 10, lenth1 = 15, height1 = 30;
		;
		int volum = 0;
		
		MethodTest1 m = new MethodTest1();
		volum = m.calcVolum(width1, lenth1, height1);
		System.out.println("첫번째 직육면체 부피 : " + volum);
		
		//두번째 직육면체 출력
		width1 = 12; 
		lenth1 = 5; 
		height1 = 51;
		volum = m.calcVolum(width1, lenth1, height1);
		System.out.println("두번째 직육면체 부피 : " + volum);
		//세번째 직육면체 출력
		System.out.println("세번째 직육면체 부피 : " + m.calcVolum(45,10,5));
	}
	
	//가로세로 높이 전달 받아서 직육면체의 부피를 리턴받는 함수 만들기
	public int calcVolum(int width, int lenth, int height)
	{
		int vol = 0;
		
		vol = width*lenth*height;
		
		return vol;
	}

}

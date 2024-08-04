package day03;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr=null; //이름만 선언하고 공간은 만들지 않는다.
		int[]arr01=new int[5]; //정수형 타입 데이터를 5개 저장할 공간 생성
		int[]arr02={1,2,3,4,5};//공간과 값을 동시 부여. 선언 시에만 가능
		
		//처음에 배열을 만들지 않았기 때문에 사용하려면 선언해줘야한다. //배열을 선언하지 않고 사용하면 공간이 없기 때문에 에러남
		arr=new int[3];
		arr01[2]=2;
		System.out.println("arr01 출력 : " + arr01); //[I@372f7a8d    [I//배열이라는 의미 @372f7a8d//주솟값
		System.out.println("arr02 출력 : " + arr02);
		System.out.println("arr02[0] 출력 : " + arr02[0]);
		System.out.println("arr02[1] 출력 : " + arr02[1]);
	}

}

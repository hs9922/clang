package firstday;

public class VariableTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num01 = 100;
		byte bnum01 = 20;
		char ch = 'C';
		int chNum = 0;
		
		//자동형변환
		// 값을 받는 num01이 대입하는 bnum01 보다 크기 때문에 자동으로 변환
		num01 = bnum01;
		
		//강제형변환
		// bnum01이 num01보다 작기 때문에 자동변환 불가. 강제로 변화시킨다.
		bnum01 = (byte)num01;
		
		//예외적으로 자동형변환이 가능한 char <--> int
		chNum = ch;
		
		System.out.println(num01);
		System.out.println(bnum01);
		System.out.println(chNum);
		
		//보통 숫자는 큰수 >> 작은수가 되는 강제형변환은 쓰지 않는다.
		// 데이터가 큰 타입을 작은 타입으로 형변환 하는 경우 값의 유실이 발생할 수 있음.
		int cc = 101;
		//특정 값을 출력할 때 형변환이 필요한 경우에도 강제형변환은 사용.
		System.out.println((char)cc);
	}

}

package CH91;

public class MyMath {
	double avg; // 평균
	//평균을 구하는 메서드
	public double average(double total,int length)//매개변수
	{
		
		avg = total/length;
		return avg;
	}
	
	//소수점을 반올림 하는 메서드
	public int round(double _avg)
	{
		//자바에서 제공하는 Math클래스의 round()메서드로 반올림
		int result = (int)Math.round(_avg);
		
		return result;
		
	}

}

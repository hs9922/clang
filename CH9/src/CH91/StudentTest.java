package CH91;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"루피", "나미"};
		int[] score1 = {77,87,90,88,72};
		int[] score2 = {81,67,91,77,83};
		
		//클래스 인스턴트생성
		//루피의 시험점수의 총점, 평균을 구한 후 출력
		//나미의 시험점수의 총점, 평균을 구한 후 출력
		MyMath m = new MyMath();
		MyArrays a = new MyArrays();
		
		double total =a.arrayTotal(score1);
		double _avg = m.average(total, score1.length);
		int avg = m.round(_avg);
		
		System.out.println(name[0] + "의 시험 점수 :");
		
		a.arraySortAsc(score1);
		
		System.out.println("");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("---------------");
		
		total =a.arrayTotal(score2);
		_avg = m.average(total, score2.length);
		avg = m.round(_avg);
		
		System.out.println(name[1] + "의 시험 점수 :");
		
		a.arraySortAsc(score2);
		
		System.out.println("");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}

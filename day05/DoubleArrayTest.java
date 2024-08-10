
package day05;

public class DoubleArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]arr01=new int[3][4];
		//열은 빈값으로 선언 가능
		int[][]arr02=new int[3][];
		//값과 공간을부여, 선언 시에만가능
		int[][]arr03= {{1,2,3},{4,5,6}};
		int[][]arr04= {{1,2,3},{4}};
		
		//출력
		for(int i=0; i<arr03.length; i++) {
			for(int j=0; j<arr03[i].length; j++) {
				System.out.print(arr03[i][j]+" ");
			}
			System.out.println();
		}
	}

}

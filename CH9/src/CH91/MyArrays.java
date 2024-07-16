package CH91;

public class MyArrays {
	
		//배열 요소들의 오름차순으로 정렬하는 메서드
		public void arraySortAsc(int[] arr)
		{
			//오름차순 정렬 하는 코드
			int temp = 0;
			for(int i=0; i<arr.length; i++)
			{
				for(int j= i+1; j<arr.length; j++)
				{
					if(arr[i] > arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for(int i =0; i< arr.length; i++)
			{
				System.out.println(arr[i] + " ");
			}
		}
		
		// 배열 요소들의 총 합을 구하는 메서드
		public double arrayTotal(int[] arr)
		{
			int total = 0;
			
			for(int i = 0; i<arr.length; i++)
			{
				total += arr[i];
			}
			return total;
		}

}

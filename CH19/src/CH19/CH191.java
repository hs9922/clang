package CH19;

interface StringComparetor{
	int compare(String str1, String str2);
}

public class CH191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringComparetor 람다식으로 구현	
		
		 StringComparetor comparetor = (str1, str2) -> {return str1.compareTo(str2); };
		
		String str1 = "apple";
		String str2 = "banana";
		
		int result = comparetor.compare(str1, str2);
		if(result > 0)
		{
			System.out.println("str1이 str2보다 사전적으로 뒤에 있다");
		}
		
		else if(result < 0)
		{
			System.out.println("str1이 str2보다 사전적으로 앞에 있다");
		}
		else 
		{
			System.out.println("str1이 str2과 같다");
		}
	}

}



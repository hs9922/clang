package CH19;

interface StrConcat{
	String concat(String str1, String str2);
}



public class CH192 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = "java";
		
		StrConcat strConcat = (s,v) -> 
		{String setence = str + "1" + s + " " + v; return setence;};
		System.out.println(strConcat.concat("Hello", "World"));
	}
}

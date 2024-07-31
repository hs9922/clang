package CH20;

//write()파일에 문자 데이터 출력하기

import java.io.FileWriter; // 2바이트의 문자로 처리 한글 저장 가능
import java.io.IOException;
import java.util.Scanner;


public class CH202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter writer = new FileWriter("C://test//test3.txt");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요");
			String str = sc.nextLine();
			
			for(int i = 0; i < str.length(); i++)
			{
				char ch = str.charAt(i);
				//매개값으로 전달 된 바이트 데이터를 출력 스트림으로 출력
				writer.write(ch);
			}
			writer.flush();
			writer.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

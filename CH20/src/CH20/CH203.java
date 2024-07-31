package CH20;

import java.io.FileReader;
import java.io.IOException;

//read()로 파일에서 바이트 데이터 읽기
public class CH203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileReader reader = new FileReader("C://test//test3.txt");
			while(true)
			{
				//지정한 파일에서 문자 데이터를 읽어 들인다.
				int data = reader.read();
				//읽어들일 데이터가 없을경우
				if(data == -1)break; //-1리턴
				System.out.println((char)data); //int 타입을 문자로 변환
			}
			reader.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

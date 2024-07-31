package CH20;

import java.io.FileInputStream;
import java.io.IOException;

//바이트 입력 스트림(InputStream)
//read 메서드

public class CH201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자에 지정한 파일에서 데이터를 읽기 위해서 객체 생성
		try {
			FileInputStream fis = new FileInputStream("C://test//test1.txt");	
			while(true)
			{
				//바이트 데이터를 읽어 들입니다.
				int data = fis.read();
				//파일의 끝에 이르면 -1을 리턴한다
				if(data == -1) break;
				//fis.available : 바이트 데이터의 개수를 리턴
				System.out.println(((char)data) + "남은 데이터 수 : " + fis.available());
			
			}
			fis.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

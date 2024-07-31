package CH20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CH204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start, end, time;
		
		start = System.currentTimeMillis();
		try
		{
			FileInputStream fis = new FileInputStream("src//CH20//9709709.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			//복사본 만들기
			FileOutputStream fos = new FileOutputStream("src//CH20//9709709_copy.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//버퍼를 이용해서 읽어들인 후, 다시 버퍼를 이용해서 출력
			while(true)
			{
				int count = bis.read();
				if(count == -1)break;
				bos.write(count);
			}
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("복사 시간 : " + time + "ms");
	}

}

//File 클래스
// 파일 입출력 작업 시 File클래스를 사용하면 운영체제 관계없이 일관성 있게 ㅏ일과 디렉터리에 쉽게 접근
// 클래스 생성자
//File (File parents, String child) :Parent 객체 폴더의 child 파일에 대한 File객체 생성

//객체 생성 하는 방법
//File 변수 = new File("C://,,,,,);



//객체 직렬화
// 네트워크를 이용해서 다른 프로그램으로 사용하는 객체의 상태를 전송하거나 파일로 저장하는 경우가 발생한다.
// 객체 직렬화 기능을 사용하면 프로그램에서 사용한 객체의 상태를 파일로 저장하거나 네트워크를 통해 다른프로그램으로 전달

// 객체 직렬화 시 객체는 바이트 데이터로 전송되거나 저장

//java.io.Serializable 인터페이스르 상속하여 직렬화가 가능한 객체로 만든다.

// 객체 역직렬화
 
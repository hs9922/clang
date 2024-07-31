package CH20;

//write()메서드로 파일에 바이트 데이터 출력하기
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class CH20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO작업시 반드시 예외 처리 해야함
		try {
			FileOutputStream fos = new FileOutputStream("C://test//test1.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요");
			String str = sc.nextLine();
			
			//문자열의 각각 문자들을 바이트 데이터로 저장
			for(int i = 0; i < str.length(); i++)
			{
				char ch = str.charAt(i);
				//매개값으로 전달 된 바이트 데이터를 출력 스트림으로 출력
				fos.write(ch);
			}
			
			System.out.println("파일에 출력했습니다");
			fos.flush(); //출력 버퍼를 비움으로써 파일에 출력
			fos.close();// 출력 스트림 닫기
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}




//자바 입출력(I/O)
// 입력값 Input/ 출력값 Output 

//스트림(Stream)
// 개울, 개천, 물이나 액체의 흐름

// 외부 장치에서 데이터가 입력되거나 출력 되는 것이 물의 흐름과 같다고 하여 스트림이라고 불리게 됨

// 자바 스트림의 정의
// 자바에서 장치 데이터를 입출력 할 수 있게 해주는 기능
// 자바의 입출력을 도와주는 클래스
//-------------------------------------------------------------
//스트림 클래스 : 단방향 (FIFO : First In First Out)으로 데이터가 흘러감
// 같은 용도의 스트림 클래스끼리 연결이 가능하다.
//-------------------------------------------------------------
// 자바 스트림의 클래스 종류
// 문자 스트림 클래스 : 입출력시 문자 데이터를 이용하여 입출력 작업을 하는 클래스 
// 바이트 데이터 : 입출력시 바이트 데이터를 이용하여 입출력 작업을 하는 클래스
//-------------------------------------------------------------
// 자바 스트림이 처리하는 데이터 종류
// 바이트 데이터
// 동영상, 이미지, 사운드와 같은 멀티 미디어 데이터를 의미
// 1byte 단위로 입출력이 이루어짐

// 문자(char) 데이터
// 일반적인 문자 데이터
// 2byte 단위로 입출력이 이루어짐

//바이트 스트림
// 데이터			입력 담당 최상위 클래스	출력 담당 최상위 클래스
// 바이트				InputStream			OutputStream
// 문자				  Reader				Writer





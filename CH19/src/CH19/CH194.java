package CH19;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		int sum = 0;
		for(int i = 0; i < 10; i++)
		{
			sum = sum + (i+1);
		}
		
		System.out.println("sum = " + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 쓰레드 " + threadName);
	}
}
public class CH194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th = new MyThread();
		//스레드를 시작
		th.start();
	}

}

//프로세스 : 프로그램이 동작하여 메모리에 올려진 상태를 말하며 실행중인 프로그램을 의미

//스레드 : 프로세스 내에서 독립적으로 실행되는 작업 단위를 의미, 
//프로세스 내의 주소 공간이나 자원들과
//같은 스레드끼리 공유하면서 실행된다.

//스레드 사용
// Thread 클래스를 상속하여 run() 메서드 구현
// Runnable 인터페이스 구현
// Runnable 인터페이스는 몸체가 없는 메서드인 run() 단 하나만을 가지는 인터페이스이다.

//스레드 기본 예제
/*String threadName = Thread.currentThread().getName();
System.out.println("현재 쓰레드 " + threadName);*/
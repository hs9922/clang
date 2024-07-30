package CH19;

//Runnable 상속
class whiteFlag implements Runnable
{
	@Override
	public void run() {
		while(true)
		{
			System.out.println("백기올려");
		}
	}
}
public class CH195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread write = new Thread(new whiteFlag());
		write.start();
	}

}


// Runnable 인터페이스 상속
// Thread th = new Thread(Runnable을 상속한 인스턴스);
// th는 참조변수

//Thread 클래스를 선언하면서 Runnable을 상속한 클래스를 선언하여 매개변수로 넘겨줘야 한다.
// 실제 Thread 클래스가 스레드를 실행하는 주체이고, Runnable 인터페이스를 상속한 클래스는 
//실행 코드를 지닌 객체이기 때문에



//Thread에 이름 부여하기 
/*
 * Thread-n
 * Thread 클래스의 setName()메서드를 이용하여 이름 변경
 * 
 * public class MyTask extends Thread
 * {
 * public MyTask()
 * {
 * setName("myTask-1");
 * }
 * }
 * 
 * getName()은 스레드의 이름을 알고 싶을때
 * 
 * Runnable task = ()->{
 * };
 * 
 * Thread myThread = new Thread(task);
 * myThread.setName("");
 * 
 * 
 */

//멀티 스레드
// 여러개의 스레드를 이용해 동시에 작업을 수행할 수 있는데,
// 이것을 우리는 멀티 스레드라고 이야기한다.
// 비동기 작업은 같은 시간에 서로 다른 독립적인 스레드가 일을 처리하는 것




package CH19;

//멀티 스레드가 실행될 때 다수의 스레드가 하나의 데이터를 공유하면서 스레드간의 경쟁이 일어난다.
// 스레드 동기화


//값이 제대로 나오지 않는 이유
// 두개의 스레드가 서로의 작업에 간섭하기 때문에 정상적인 값이 나오지 않음

//동기화 하는 키워드 : synchronized
//동기화 하는 방법 : 메서드 동기화, 블록 동기화
//메서드 동기화
// public synchronized void add().....

//블록 동기화
class Bank
{
	private int money;
	
	public int getMoney()
	{
		return money;
	}
	public void addMoney(int money)
	{
		this.money += money; 
	}
	//addMoney()메서드가 동기화
	/*public synchronized void addMoney(int money)
	{
		this.money += money; 
	}*/
}


class AddThread implements Runnable
{
	private Bank b; //Bank 클래스 선언
	private String name;
	public AddThread(String name, Bank b)
	{
		this.name = name;
		this.b= b;
	}
	
	@Override
	public void run()
	{
		// 블록 동기화: 스레드의 간섭을 막기 위해서
		// 전체 메서드가 아닌 특정 영역만 동기화
		// 순서 
		// 1. 스레드 1이 블록진입
		// 스레드1 : synchronized(b) 블록에 들어가서 잠금 획득
		//b.addMoney(1000) 호출 및 잔고 출력
		// 블록을 벗어나면 잠금 해제
		
		//2. 스레드 2가 대기
		// => synchronized(b) 블록에 들어가려 하지만, 스레드1이 잠금을 보유하고 있어 대기
		
		//3. 스레드 1실행 완료 후 스레드 3가 블록에 진입
		// 스레드2 : synchronized(b) 블록에 들어가서 잠금 획득
		//b.addMoney(1000) 호출 및 잔고 출력
				// 블록을 벗어나면 잠금 해제
		synchronized(b) {
		try
		{
			for(int i = 0; i < 10; i++)
			{
				//Sleep(int mils)메서드는 주어진 시간 동안 스레드를 정지시키는 메서드
				// 작업 속도 제어할 때 사용
				Thread.sleep(1000);
				b.addMoney(1000);
				System.out.println(this.name + "현재 잔고 : " + b.getMoney());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
			
}

public class CH197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread("1번", b));
		Thread th2 = new Thread(new AddThread("2번", b));
		
		th1.start();
		th2.start();
	}

}

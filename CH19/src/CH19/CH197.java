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
	
	//addMoney()메서드가 동기화
	public synchronized void addMoney(int money)
	{
		this.money += money; 
	}
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
		try
		{
			for(int i = 0; i < 10; i++)
			{
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

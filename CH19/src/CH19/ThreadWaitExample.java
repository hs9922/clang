package CH19;

class AddStackThread extends Thread{
	private Storage storage;
	
	public AddStackThread(Storage storage)
	{
		this.storage = storage;
	}
	
	@Override
	public void run()
	{
	try{
		while(true) {
			Thread.sleep(1000);
			if(this.storage.getStackCount() == 0)
			{
				System.out.println("짐 추가");
				this.storage.addStack(10);
			}
		}
		}catch(Exception e)
	{
			e.printStackTrace();
	}
	}
	
}

class PopStackThread extends Thread
{
	private Storage storage;
	public PopStackThread(Storage storage)
	{
		this.storage= storage;
	}
	
	@Override
	public void run()
	{
		try {
			while(true){
				{
					Thread.sleep(1000);
					System.out.println("짐 5개 나르기");
					this.storage.popStack(5);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
	}

}


// 여러개의 스레드가 동시 동작 하다보면, 하나의 스레드가 완료 되어야 다음 동작을 할 수 있는 경우
// Wait 메서드 : 스레드 대기
// notify() 메서드 : 대기중인 스레드를 다시 동작
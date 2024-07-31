package CH19;

public class Storage {

	// 기본 10개의 값을 가짐
	private int stackCount = 10;
	
	//메서드 동기화
	public synchronized void addStack(int stackCount)
	{
		this.stackCount += stackCount;
		if(this.stackCount >= 10)
		{
			System.out.println("스레드 깨우기");
			// 잠자는 스레드 깨우기
			notify();
		}
	}
	
	//메서드 동기화
	public synchronized void popStack(int leaveCount)
	{
		//현재 남아있는 것보다 꺼낼 것이 많다면
		try {
			if(leaveCount > this.stackCount)
			{
				this.stackCount = 0;
			}
			else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0)
			{
				System.out.println(" 짐 없음 대기");
				wait();
				System.out.println("짐 없음 완료");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int getStackCount()
	{
		return this.stackCount;
	}
	
	// 짐은 기본 10개로 시작
	// 짐이 10개 이상일 때 대기중인 스레드를 꺼냄
	// 짐이 0일때 스레드를 멈춤
}

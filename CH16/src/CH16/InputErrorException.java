package CH16;

public class InputErrorException extends Exception {
	
	private String message;
	
	public InputErrorException(String message)
	{
		this.message = message;
	}

	//Exception이 지닌 getMessage() 메서드를 오버라이드 하여 재정의 한다.
	//입력받은 메시지를 리턴한다.
	@Override
	public String getMessage()
	{
		return this.message;
	}
}

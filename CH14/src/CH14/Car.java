package CH14;
// 인터페이스는 미완성 클래스이기 때문에
// 상속 x = 다중으로 상속이 가능하기 때문에
// '구현'
//상수 + 추상 메서드
public interface Car {
	
	//상수 선언
	public static final int SAFE_SPEED = 60;
	
	//추상 메서드
	public abstract void speedUp();
	public abstract void speedDown();
	public abstract void stop();
}

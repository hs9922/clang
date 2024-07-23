package CH13;

public class CH13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동형 변환
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		
		//윤기의 자전거는 2발 자전거입니다
		//씽씽
		
		//강제 형 변환
		//단, 모든 부모 타입 객체를 자식 타입으로 변환 할 수 있는 것은 아님
		//반드시 자동 타입 변환되었던 자식 객체를 다시 자식 타입으로 변환할 때만 강제 타입 변환 가능
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel(); //자식에 있는 메서드 사용 가능
		fwb.info();
		fwb.ride();

	}

}

package CH121;

class Cars{}
class Buss extends Cars{}
class schoolBuss extends Buss{}

class OpenCar extends Cars{}
class SportCar extends OpenCar{}


public class Ccar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1차 상속 관계가 아니더라도 가능
		Cars c1 = new schoolBuss();
			
		//버스 객체 생성
		Buss b1 = new Buss();
		
		//자동 타입 변환 가능
		Buss b2 = new schoolBuss();
		
		Cars c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		//오류나는 코드
		//Buss b3 = new OpenCar();
		//Buss b4 = new SportCar();
	}

}

package CH13;

public class ComTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerRoom cr = new ComputerRoom();
		cr.computer1 = new Samsong();
		cr.computer2 = new Samsong();
		
		cr.allPowerOn();
		cr.allPowerOff();

	}

}

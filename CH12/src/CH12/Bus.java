package CH12;

public class Bus extends Car {
	
    int peopleNum;

    //Bus 생성자
    public Bus(int peopleNum) 
    {
    	//peopleNum 초기화
       this.peopleNum = peopleNum;
    }

    public void takePerson() 
    {
        System.out.println("승객이 버스에 탔습니다");
        peopleNum++; //peopleNum 증가
        System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명 입니다.");
    }
}

package CH12;
//Bus를 상속받는 자식 클래스
public class SchoolBus extends Bus {
	
	//매개변수 1개를 가진 생성자
    public SchoolBus(int peopleNum) 
    {
    	//Bus클래스의 생성자 호출
        super(peopleNum);
    }
    
    //Bus 클래스의 takePerson 오버라이딩
    @Override
    public void takePerson() 
    {
    	 //Bus 클래스의 takePerso()메서드 호출
    	//super.메서드();
    	super.takePerson();
    	
        System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
    }

  //Bus 클래스의 ride 오버라이딩
    @Override
    public void ride() 
    {
    	  System.out.println("시속 50km/h로 천천히 달립니다");
    }
}

package CH8;

//getter와 setter 메서드
// getter는 외부에서 객체의 데이터를 읽을 때 사용하는 메서드
// setter는 외부에서 메서드를 통해 필드에 접근해서 값을 바꿀 수 있는 메서드

// 이를 사용하는 이유.
// 필드를 보호할 수 있다.
// 메서드에서 필드에 들어갈 값을 검증한 후 필드에 대입할 수 있다.
// 외부에서 사용할 필드의 값을 정제한 후 값을 제공할 수 있다.

//getter/setter : private 필드(전역변수)의 값을 대입하는 방법으로 setter 메서드를 사용한다.
				// 반대로 객체 외부에서 private 필드(전역변수)의 값을 구하기 위해서는 getter 메서드를 사용한다.

public class Per {
	
	//접근 제한자 : private
	//해당 클래스에서만 사용 가능
	//외부에서 부르는것이 불가능
	private int age;

	void setAge(int num)
	{
		if(num <= 0)
		{
			System.out.println("잘못된 수를 입력했습니다");
		}
		else
		{
			age = num;
			System.out.println();
		}
		
	}
	
	int getAge()
	{
		return age;
	}
}

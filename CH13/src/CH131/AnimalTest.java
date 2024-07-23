package CH131;

class Animal{}
class Pig extends Animal{}
class Cow extends Animal{}

//instanceof 연산자
//객체 instanceof 타입(클래스명)
// instanceoㄹ 기준으로 왼쪽 객체가 생성될 때 오른쪽 타입으로 생성되었는지 확인하는 연산자
// 맞으면 true, 아니면 false를 반환하여 만약 null을 가리키고 있으면 false를 반환

//instanceof 와 == 차이
// A instanceof B : 객체 변수 A가 객체 타입 B로 '생성'된것인지 확인
// C == D : 객체 변수 C아 객체변수 D가 같은 객체를 '참조'하고 있는지 확인 
class Farm
{
	void sound(Animal animal)
	{
		if(animal instanceof Pig) //animal 변수에 담긴 객체타입이 pig면
		{
			System.out.println("꿀꿀");
		}
		
		else //animal 변수에 담김 객체타입이 pig가 아니라면
		{
			System.out.println("음메");
		}
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(c);
	}

}

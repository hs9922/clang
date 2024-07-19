package CH121;
//부모
public class Calendar {
String color;
int month;

//생성자(매개변수color, month)
public Calendar(String color, int month)
{
	this.color = color;
	this.month = month;
}
// 초기화

void info()
{
	System.out.println(color + " 달력은 " + month + "월 까지 있습니다");
}


void hang()
{
	System.out.println(color + " 달력은 벽에 걸 수 있습니다");
}

}

package chapter11;

public abstract class Computer {

	//하위클래스에 구현을 위임
	public abstract void display();//body가 없는 메소드
	public abstract void typing();
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}

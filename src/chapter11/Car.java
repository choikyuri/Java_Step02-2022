package chapter11;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar()
	{
		System.out.println("시동을 켭니다");
	}
	
	public  void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	//재정의가 안되는 메서드=탬플릿 메서드
	//public final void run()
	final public void run()
	{
		startCar();
		drive();
		stop();
		turnOff();
	}
}

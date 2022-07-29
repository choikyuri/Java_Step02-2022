package chapter10;

//자식
public class Bike extends Vehicle{
	
	private int bikeNum=1006;

	@Override
	public void run() {
		System.out.println(bikeNum+"번 오토바이가 달립니다");
	}
	
	
	
	

}

package chapter10;

public class SupersonicAirplane extends Airplane {
	
	//NORMAL=1 SUPERSONIC=2
	//필드(전역변수,변경할수 없게 선언)
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else 
			super.fly();
	}
	

}

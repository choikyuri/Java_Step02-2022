package chapter10;

public class AirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //재정의 메소드
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL; //재정의 메소드
		sa.fly();
		sa.land();

	}

}

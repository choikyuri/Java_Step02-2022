package chapter10;

public class AirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //������ �޼ҵ�
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL; //������ �޼ҵ�
		sa.fly();
		sa.land();

	}

}

package chapter10;

public class VehicleMain {

	public static void main(String[] args) {
		
		Driver driver=new Driver();
		driver.drive(new Bus()); //Vehicle bus=new Bus();
		driver.drive(new Taxi());//Vehicle bus=new Taxi();  		
		driver.drive(new Bike()); //Vehicle bus=new Bike();  		

	}

}

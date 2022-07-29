package chapter11;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("È«±æµ¿");
		
		System.out.println(smartPhone.owner +"´Ô");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

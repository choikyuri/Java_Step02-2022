package chapter11;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		System.out.println(smartPhone.owner +"��");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

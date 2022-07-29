package chapter12;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-----------------------");
		
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();
		//수행하고자 하는 메서드가 있는 클래스로 업케스팅해야함
		//rc.search("www.naver.com");//ERROR
		
		//search메서드는 Searchable에 존재하므로 업케스팅
		Searchable searchable = tv;
		//ERROR
		/*searchable.turnOn();
		searchable.setVolume(-5);
		searchable.turnOff();*/
		searchable.search("www.naver.com");		
	}
}

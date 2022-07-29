package chapter12;

public class SmartTelevision implements Remote, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume>Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		} else if(volume<Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}

package chapter11;

public class DeskTop extends Computer{
	//추상 클래스를 상속 받았으므로 구현을 하거나 abstract class이너나를 선택해야한다

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");		
	}

}

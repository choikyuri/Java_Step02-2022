package chapter11;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 객체를 만들수 없음
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.typing();
		c4.typing();
	}
}

package chapter11;


public class MyNoteBook extends NoteBook{
	//상속받은 두개의 추상메소드중 구현되지 않은 메소드 하나만 구현
	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing()");
	}

}


package chapter11;

public abstract class  NoteBook extends Computer{
    //상속받은 두개의 추상메소드중 하나만 구현
	@Override
	public void display() {
		System.out.println("NoteBook Display()");		
	}
	
}
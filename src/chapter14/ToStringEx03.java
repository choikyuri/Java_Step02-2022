package chapter14;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
    //String class의 문자를 출력해주는 toString 재정의 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return title + "," +author;
	}
	
	
}

public class ToStringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Book book=new Book("자바","홍길동");
		//객체는 heap메모리를 사용하므로 16진수의 메모리 주소를 출력
		System.out.println(book);
		//String class에는 ToString이 재정의 되있으므로 문자출력
		String str=new String("test");
		System.out.println(str);
	}

}

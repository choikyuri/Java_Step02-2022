package chapter14;


class BK{
	
	int bookNumber;
	String BookTitle;
	
	public BK(int bookNumber, String BookTitle) {
		this.bookNumber=bookNumber;
		this.BookTitle=BookTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return BookTitle+", "+bookNumber;
	}
	

	
}


public class ToStringEx02 {
	
	public static void main(String[] args) {
		
		BK book1=new BK(200, "����");
		System.out.println(book1);//Integer,String�� ToString����Ǿ� ����
		System.out.println(book1.toString());
		
		
	}

}

package chapter14;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
    //String class�� ���ڸ� ������ִ� toString ������ 
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
       
		Book book=new Book("�ڹ�","ȫ�浿");
		//��ü�� heap�޸𸮸� ����ϹǷ� 16������ �޸� �ּҸ� ���
		System.out.println(book);
		//String class���� ToString�� ������ �������Ƿ� �������
		String str=new String("test");
		System.out.println(str);
	}

}

package chapter14;

public class StringEquals02 {

	public static void main(String[] args) {
		
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1==str2); //heap �޸� (������)
		System.out.println(str1.equals(str2));//���ڿ�(���� �Ǵ�)
		
		
		//���Ǯ (Data)
		String str="abc";
		String str4="abc";
		
		System.out.println(str==str4); //������
		
		Integer i1=new Integer(100);//heap
		Integer i2=new Integer(100);//heap
		
		Integer i3=100;
		Integer i4=100;
		
		System.err.println(i1==i2);//��ü
		System.err.println(i3==i4);//���Ǯ
		System.out.println(i1.equals(i2));
		

	}

}

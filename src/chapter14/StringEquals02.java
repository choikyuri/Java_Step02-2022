package chapter14;

public class StringEquals02 {

	public static void main(String[] args) {
		
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1==str2); //heap 메모리 (물리적)
		System.out.println(str1.equals(str2));//문자열(논리적 판단)
		
		
		//상수풀 (Data)
		String str="abc";
		String str4="abc";
		
		System.out.println(str==str4); //물리적
		
		Integer i1=new Integer(100);//heap
		Integer i2=new Integer(100);//heap
		
		Integer i3=100;
		Integer i4=100;
		
		System.err.println(i1==i2);//객체
		System.err.println(i3==i4);//상수풀
		System.out.println(i1.equals(i2));
		

	}

}

package chapter14;

public class StBufferTest2 {

	public static void main(String[] args) {
		
		String javaStr=new String("Java");
		
		System.out.println("javaStr ���ڿ� : "+ javaStr);
		System.out.println("javaStr ���ڿ� �ּ� : "+ System.identityHashCode(javaStr));
		System.out.println();
		
		StringBuffer buffer=new StringBuffer(javaStr);
		System.out.println("���� �� buffer ���ڿ� : "+buffer);
		System.out.println("���� �� buffer ���ڿ� �ּ� : "+ System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("���� �� buffer ���ڿ� : "+buffer);
		System.out.println("���� �� buffer ���ڿ� �ּ� : "+ System.identityHashCode(buffer));
		System.out.println();
		
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr ���ڿ� �ּ� : "+ System.identityHashCode(javaStr));
		
		
		

	}

}

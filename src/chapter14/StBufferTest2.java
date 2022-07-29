package chapter14;

public class StBufferTest2 {

	public static void main(String[] args) {
		
		String javaStr=new String("Java");
		
		System.out.println("javaStr 문자열 : "+ javaStr);
		System.out.println("javaStr 문자열 주소 : "+ System.identityHashCode(javaStr));
		System.out.println();
		
		StringBuffer buffer=new StringBuffer(javaStr);
		System.out.println("연산 전 buffer 문자열 : "+buffer);
		System.out.println("연산 전 buffer 문자열 주소 : "+ System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 문자열 : "+buffer);
		System.out.println("연산 후 buffer 문자열 주소 : "+ System.identityHashCode(buffer));
		System.out.println();
		
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : "+ System.identityHashCode(javaStr));
		
		
		

	}

}

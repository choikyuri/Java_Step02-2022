package chapter15;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		
		System.out.println("javaStr 문자열 : " + javaStr);
		//처음 생성된 메모리 주소
		System.out.println("javaStr 문자열 주소 :" +System.identityHashCode(javaStr));
		System.out.println();	
		StringBuilder buffer = new StringBuilder(javaStr); //String으로 부터 StringBuilder생성
		System.out.println("연산 전 buffer 문자열 : "+buffer);
		//buffer 메모리 주소
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));
		buffer.append(" and");                // 문자열 추가
		buffer.append(" android");            // 문자열 추가
		buffer.append(" programming is fun!!!"); //문자열 추가
		
		System.out.println("연산 후 buffer 문자열 : "+buffer);
		//buffer 메모리 주소
		System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));
		System.out.println();
		javaStr = buffer.toString(); //toString에 의하여 문자열로 출력
		System.out.println(javaStr);
		//새로 생성된 메모리 주소
		System.out.println("새로 만들어진 javaStr 문자열 주소 :" +System.identityHashCode(javaStr)); 

		}
}
package chapter14;

public class StringEquals {

	public static void main(String[] args) {
		
		/*
		 * String str1=new String("test"); 
		 * String str2=new String("test");
	
		 * System.out.println(str1 == str2);//heap 메모리가 같은지를 반환
		 * System.out.println(str1.equals(str2));//문자열이 같은지를 반환(논리적 판단)
		 */		
		//heap memory
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);  // 두 스트링 인스턴스의 주소 값은 다름
		System.out.println(str1.equals(str2)); // String 클래스의 equals 메소드가 재정의 됨
		
		//상수풀
		String str="abc";
		String str4="abc";
		
		System.out.println(str==str4);
		
		// JAVA 9이상에서는 사용중단이 적용됨(생성자를 더이상 사용하지 않음)
		//Boxing : 기본 타입값을 포장하여 객체로 만드는 과정
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		
		System.out.println(i1 == i2);   // 두 정수 인스턴스의 주소 값은 다름 
		System.out.println(i1.equals(i2)); // Integer 클래스의 equals 메소드가 재정의 됨
	}
}


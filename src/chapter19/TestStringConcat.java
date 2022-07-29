package chapter19;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		//인터페이스 방식
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		//람다방식
		StringConcat concat2 = (s, v)->System.out.println(s + "," + v ); //System.out.println(i);
		concat2.makeString("Hello", "World");
		
		//익명의 내부 클래스 방식
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println( s1 + "," + s2 );
			}
		};
		
		concat3.makeString("hello", "world");
		
	}

}


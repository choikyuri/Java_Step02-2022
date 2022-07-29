package pk17;

public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr=new String("java");
		String androidStr=new String(" android");
		System.out.println(javaStr); //toString
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr)); 
		
		javaStr=javaStr.concat(androidStr);
		System.out.println("-----------------------");
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));

	}

}

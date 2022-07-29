package chapter14;

public class StringTest {

	public static void main(String[] args) {
		
		String str="";
		String str1="Hi everybody!";
		String str2="Have a nice day!";
		
		System.out.println(System.identityHashCode(str1));
		
		//str1의 다른주소로 반환
		//str1=str1.concat(str2);
		
		//str1의 같은주소로 반환
		str=str1.concat(str2);
		System.out.println(str);
		
		System.out.println(System.identityHashCode(str1));
		
		System.out.println("str1의 글자수 : "+str1.length());
		System.out.println("str2의 글자수 : "+str2.length());
		
		System.out.println("str1의 d글자위치 : "+str1.indexOf('d'));
		System.out.println("str2의 d글자위치 : "+str2.indexOf('d'));
		
		System.out.println("str1 모두소문자로 : "+str1.toLowerCase());
		System.out.println("str2 모두소문자로 : "+str2.toLowerCase());
		
		System.out.println("str1 모두대문자로 : "+str1.toUpperCase());
		System.out.println("str2 모두대문자로 : "+str2.toUpperCase());
		

	}

}

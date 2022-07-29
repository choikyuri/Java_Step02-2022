package pk17;



public class StringTest1 {

	public static void main(String[] args) {

		//객체 인스턴스 각각의 heap메모리 생성
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);//물리적 false
		System.out.println(str1.equals(str2));//논리적 true
		
		//문자열은 상수값으로 Data영역에 고정된 주소 사용
		 String str3="abc";
		 String str4="abc";
		 
		 System.out.println(str3==str4);//물리적 true
		 System.out.println(str3.equals(str4));//논리적 true
		
	
	}

}

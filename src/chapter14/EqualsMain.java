package chapter14;

public class EqualsMain {

	public static void main(String[] args) {

		Student studentLee=new Student(100, "이상우");
		Student studentLee2=studentLee;
		Student studentKim=new Student(100, "이상우");
		
		System.out.println("==동일한 주소의 두 인스턴스 비교==");
		if(studentLee==studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");

		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else 
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
		System.out.println();
		
		//주소는 다르지만 equals의 결과는 같다
		if(studentLee==studentKim)
			System.out.println("studentLee와 studentKim의 주소는 같습니다");
		else 
			System.out.println("studentLee와 studentKim의 주소는 다릅니다");
		
		if(studentLee.equals(studentKim))
			System.out.println("studentLee와 studentKim는 동일합니다");
		else 
			System.out.println("studentLee와 studentKim는 동일하지 않습니다");
		System.out.println();
		
		System.out.println("*********데이터 값 출력**********");
		System.out.println("*****Student클래스의 실제hashcode값 출력*****");
		System.out.println("studentLee의 실제주소 : "+System.identityHashCode(studentLee));
		System.out.println("studentKim의 실제주소 : "+System.identityHashCode(studentKim));
		System.out.println("*****Student클래스의 실제값 출력*****");
		System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
		System.out.println("studentKim의 hashCode : "+studentKim.hashCode());
		
		//hashcode가 재정의 됨
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println("*****String클래스의 실제값 출력*****");
		System.out.println("str1의 hashCode : "+str1.hashCode());
		System.out.println("str2의 hashCode : "+str2.hashCode());
		
		System.out.println("*****값출력*****");
		System.out.println(studentLee.toString());
		System.out.println(studentKim.toString());
		
		
	}

}

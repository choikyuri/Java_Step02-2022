package pk17;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		 // 방법1
		Person person=new Person();
		//getClass();클래스의 정보를 가져옴
		Class pClass1=person.getClass(); //Object에서 주는 메서드로 Person클래스의 정보 가져옴
		System.out.println(pClass1.getName());//정보중에서  이름을 가져와
		
		//방법2
		Class pClass2=Person.class; //직접 클래스명으로 클래스의 정보 가져오기
		System.out.println(pClass2
				.getName());//정보중에서  이름을 가져와
		
		//방법3 :클래스명을 알고있다고 가정
		Class pClass3=Class.forName("pk17.Person");
		//지정한 이름의 클래스가 없을경우 : ClassNotFoundException 발생하도록 유도함
		System.out.println(pClass3.getName());
		
		
	}

}

package collection.vector;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		// vector에서는 add와 addElement모두 사용
		//차이점은 add는 boolean으로 반환 addElement는 별도의 반환값없음
		Object obj;				
		//크기1의 배열 선언
		Vector<Object> vec =new Vector<Object>(1);
		obj="hi";
		vec.addElement(obj);//엘리먼트 추가
		//vector의 용량 수 : 1->2->4->8->16->32로 증가됨
		System.out.println("용량은#1 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#1 : "+vec.size());
		System.out.println();
		
		obj="some people";
		vec.addElement(obj);//엘리먼트 추가
		System.out.println("용량은#2 : "+vec.capacity());
		System.out.println("크기는#2 : "+vec.size());
		System.out.println();
		
		obj="dream of success";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#3 : "+vec.capacity());
		System.out.println("크기는#3 : "+vec.size());	
		System.out.println();
		
		obj="while";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#4 : "+vec.capacity());
		System.out.println("크기는#4 : "+vec.size());
		System.out.println();
		
		obj="other people";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#5 : "+vec.capacity());
		System.out.println("크기는#5 : "+vec.size());
		System.out.println();
		
		obj="get up";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#6 : "+vec.capacity());
		System.out.println("크기는#6 : "+vec.size());
		System.out.println();
		obj="evety morning";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#7 : "+vec.capacity());
		System.out.println("크기는#7 : "+vec.size());
		System.out.println();
		
		obj="and make";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#8 : "+vec.capacity());
		System.out.println("크기는#8 : "+vec.size());	
		System.out.println();
		
		obj="it happen";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#9 : "+vec.capacity());
		System.out.println("크기는#9 : "+vec.size());	
		

		System.out.println(vec);
	}
}

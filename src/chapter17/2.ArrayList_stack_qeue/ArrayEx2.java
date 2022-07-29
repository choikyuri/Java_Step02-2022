package chapter17;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("을지문덕");
		list.add("연개소문");
		
		System.out.println(list);
		
		System.out.println("---------Iterator-----------");
		//반복자 : Iterator
		Iterator<String> it=list.iterator();
		
		//반복자 활용
		while(it.hasNext()) {
			String v=it.next();//unBoxing
			System.out.println(v);
		}
		
		System.out.println("---------------------");
		
		System.out.println("list[0] : " + list.get(0));
		System.out.println("list[2] : " + list.get(2));
	}

}
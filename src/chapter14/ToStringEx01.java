package chapter14;

import java.util.Date;

public class ToStringEx01 {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		Date obj2=new Date();
		System.out.println(obj1);
		System.out.println("Object : "+obj1.toString());
		System.out.println(obj2);
		System.out.println("Date : "+obj2.toString());
	}

}

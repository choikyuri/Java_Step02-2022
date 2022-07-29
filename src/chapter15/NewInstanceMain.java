package chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class NewInstanceMain {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		//toString
		String str=new String("ȫ�浿");
		System.out.println(str);
		*/
		
		Person person1=new Person();
		System.out.println(person1);
		
		Class pClass=Class.forName("chapter14.Person");
		System.out.println(pClass);
		Constructor[] cons=pClass.getConstructors();
		for(Constructor con:cons) {
			System.out.println(con);
		}
		
		System.out.println("----------------------------------");
		Field[] fields=pClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		
		System.out.println("----------------------------------");
		Method[] method=pClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		
		
		

	}

}

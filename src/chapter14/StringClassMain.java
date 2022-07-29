package chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class StringClassMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass=Class.forName("java.lang.String");
		//String »ý¼ºÀÚ
		Constructor[] cons=strClass.getConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		
		System.out.println("----------------------------------");
		Field[] fields=strClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		
		System.out.println("----------------------------------");
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		
		
	}

}

package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
		Class c = Class.forName(className);  //ClassNotFoundException 발생
		return c;
	}

	public static void main(String[] args) {

		ThrowsException2 test = new ThrowsException2();

		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException  | ClassNotFoundException e) {
			// | 논리연산자. > < >= <= 등 관게연산자 사용시 ||
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

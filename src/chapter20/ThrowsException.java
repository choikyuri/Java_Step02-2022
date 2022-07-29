package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
		Class c = Class.forName(className);  //ClassNotFoundException 발생
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		//우클릭하여 surround with try/catch
		//test.loadClass("b.txt", "java.lang.String");
	
		try {
			test.loadClass("b.txt", "java.lang.String");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		//만약 발생하는 Exception중 잡지 못하는게 있다면 마지막 catch에 추가 (모든 Exception의 최상위)
		}catch(Exception e) {
			System.out.println(e);
		}	
		System.out.println("end");
	}
}
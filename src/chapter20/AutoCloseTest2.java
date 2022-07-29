package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AutoCloseTest2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		//자바 9이후 밖에서 선언해도 됨
		AutoCloseObj obj = new AutoCloseObj();
    	try (obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}

package chapter20;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		try (AutoCloseObj obj2 = new AutoCloseObj()){
			throw new Exception(); //예외 발생
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}

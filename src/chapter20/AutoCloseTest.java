package chapter20;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		try (AutoCloseObj obj2 = new AutoCloseObj()){
			throw new Exception(); //���� �߻�
		}catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}
	}
}

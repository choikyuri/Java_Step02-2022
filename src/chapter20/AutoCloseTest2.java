package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AutoCloseTest2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		//�ڹ� 9���� �ۿ��� �����ص� ��
		AutoCloseObj obj = new AutoCloseObj();
    	try (obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}
	}
}

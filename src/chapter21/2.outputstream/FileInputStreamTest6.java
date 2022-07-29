package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest6 {

	public static void main(String[] args) throws IOException {
				
		try (FileOutputStream fos = new FileOutputStream("resource.txt");
				FileInputStream fis = new FileInputStream("resource.txt")){   //try �����ȿ��� ����� ��� �ڵ� close() ȣ��
			
			fos.write(68);//�����Ǵ� ���ڷ� ����. ���ڸ� ����ϰ� ������ ������Ʈ��
			fos.write(69);
			fos.write(70);
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
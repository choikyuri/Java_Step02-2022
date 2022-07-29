package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest6 {

	public static void main(String[] args) throws IOException {
				
		try (FileOutputStream fos = new FileOutputStream("resource.txt");
				FileInputStream fis = new FileInputStream("resource.txt")){   //try 구문안에서 선언된 경우 자동 close() 호출
			
			fos.write(68);//대응되는 문자로 츨력. 숫자를 출력하고 싶으면 보조스트림
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
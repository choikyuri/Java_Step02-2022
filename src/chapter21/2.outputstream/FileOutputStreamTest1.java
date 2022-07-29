package chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		//("output.txt", true) //����� �ȵ�. �߰���
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(71);  //A
			fos.write(72);  //B
			fos.write(73);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}

package chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		//("output.txt", true) //덮어쓰기 안됨. 추가되
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(71);  //A
			fos.write(72);  //B
			fos.write(73);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}

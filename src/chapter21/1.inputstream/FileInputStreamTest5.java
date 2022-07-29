package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) throws IOException {
	
		//true : append(추가)
		try(FileOutputStream fos=new FileOutputStream("resource.txt",true);//자동생성
				FileInputStream fis=new FileInputStream("resource.txt")){
			
			fos.write(77);//D
			fos.write(78);//E
			fos.write(79);//F
			
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
		
		}catch(IOException e) {
			System.out.println(e);
			
		}

	}

}

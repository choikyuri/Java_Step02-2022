package inputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		//한글깨짐	  
		//FileInputStream fis =null; 
		FileReader fis=null; 
		try {	
			//fis=new FileInputStream("input.txt");
			fis = new FileReader("input.txt");
			int i;
			//fis.read() : 파일을 끝까지 읽을면 -1을 반환
			while ( (i = fis.read()) != -1){
				System.out.print((char)i+" ");
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println(e);
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				//NullPointerException를 잡지못해서 죽음
				//catch 추가
			} catch (NullPointerException e){
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
package inputstream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//FileInputStream안에 AutoClose가 구현되어있음
			fis = new FileInputStream("input.txt");
			//숫자로 출력 65,66,67
			//System.out.println(fis.read());
			//System.out.println(fis.read());
			//System.out.println(fis.read());
			//문자로 출력 A,B,C
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
		
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

package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionHandling2 {

	public static void main(String[] args)  {
		FileInputStream fis = null;
		//클릭으로 try catch 문 불러오기
		//fis = new FileInputStream("a.txt");
		
				
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// e.printStackTrace(); 구문이 길어서 출력만
			System.out.println(e);
		}finally {//입출력은 close 해주어야함
			//fis.close();//없는데 닫으면 에러 그러므로 우클릭으로 try catch 문 불러오기
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");	
 }
}

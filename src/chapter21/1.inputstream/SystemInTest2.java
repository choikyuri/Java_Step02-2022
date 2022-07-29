package chapter21.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 입력후 [Enter]키를 누르세요");
		
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {
				//System.out.print(i+" ");
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


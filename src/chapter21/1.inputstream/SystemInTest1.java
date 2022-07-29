package chapter21.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		/*
		int i = System.in.read();//우클 try catch
		System.out.println(i);*/
		
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);//아스키 코드값
			System.out.println((char)i); //문자
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

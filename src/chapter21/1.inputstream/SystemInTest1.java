package chapter21.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		/*
		int i = System.in.read();//��Ŭ try catch
		System.out.println(i);*/
		
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);//�ƽ�Ű �ڵ尪
			System.out.println((char)i); //����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package chapter23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer02 extends Thread{
	
ServerSocket ss;
	
	public MyServer02() {
		
		try {
			/*
			 ���������� �����ҽÿ� ���� ��Ʈ��ȣ�� �����Ͽ� Ŭ���̾�Ʈ�� �����Ҽ� �ֵ��� �����Ѵ�
			 ��Ʈ��ȣ�� ���Ȼ� 2000�� ���� ��ȣ�� �����Ѵ�
			 */
			ss=new ServerSocket(3001); //�����غ� �Ϸ�
			
			System.out.println("���� �غ� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public static void main(String[] args) {
		new MyServer02().start(); //���α׷� ����

	}


	@Override
	public void run() {
		
		while(true) {
			//��������ϰ� �ٷ� ���ڿ��� �޾Ƴ��� ���
			try {
				Socket s=ss.accept();
				
				//Ŭ���̾�Ʈ�� �������ڸ��� ������ ������ ������ ������Ʈ���� �̿��Ͽ� �ٷ� �޾Ƴ���
				BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
				String ip=s.getInetAddress().getHostAddress();
				String msg=reader.readLine(); //�����ڰ� �����޼��� ����
				
				System.out.println(ip+" : "+msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	

}

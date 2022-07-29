package chapter23;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer01 extends Thread{
	
	ServerSocket ss;
	
	public MyServer01() {
		
		try {
			/*
			 ���������� �����ҽÿ� ���� ��Ʈ��ȣ�� �����Ͽ� Ŭ���̾�Ʈ�� �����Ҽ� �ֵ��� �����Ѵ�
			 ��Ʈ��ȣ�� ���Ȼ� 2000�� ���� ��ȣ�� �����Ѵ�
			 */
			ss=new ServerSocket(3000); //�����غ� �Ϸ�
			
			System.out.println("���� �غ� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	

	@Override
	public void run() {
		// ������ ���ѹݺ��� �ϸ鼭 Ŭ���̾�Ʈ�� ������ ��ٸ���
		while(true) {
			
			try {
				Socket s=ss.accept(); //Ŭ���̾�Ʈ ��û�� �����Ͽ� �����ڸ� �޾Ƶ��δٴ� ��
				//�� �����ڰ� �ö����� �Ʒ��� ������ �������� �ʰ� ���Ѵ�� ���¸� ����
				
				//��Ʈ�� ������ �Ϸ�Ǹ� Ŭ���̾�Ʈ�� ip�ּҸ� �����´�
				String ip=s.getInetAddress().getHostAddress();
				
				System.out.println(ip+"�� �Դ� ��!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		MyServer01 ms=new MyServer01();
		ms.start();
		
		//new MyServer01().start();
		//���� ��ü�� Thread�κ��� ��� �޾����Ƿ� �ڽ��� �� �����尡 ��
		//�׷��Ƿ� �������ڸ��� start()�� ȣ���Ͽ� Thread�� ���۽�ų�� ����
	}

}

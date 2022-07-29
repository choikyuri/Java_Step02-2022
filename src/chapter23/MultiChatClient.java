package chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {

	public static void main(String[] args) {

		try {
			
			Socket socket=new Socket("172.16.10.54",9998);
			Scanner scanner = new Scanner(System.in);
			System.out.print("name:");
			String name = scanner.nextLine();
			Thread sender=new Thread(new ClientSender(socket, name));
			Thread receiver=new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
	   }
    }//main
	
	//inner class
	static class ClientSender extends Thread{
		Socket socket=null;
		DataOutputStream out;
		String name;
		//�����ε�
		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;
			try {
				out=new DataOutputStream(socket.getOutputStream());//��� ���� ������
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//������

		@Override
		public void run() {
			Scanner scan=new Scanner(System.in);
			try {
				if(out != null)  //������ ���ִٸ�
					out.writeUTF(name); //�̸��� �����Ͽ� ������
				
				while(out != null) {
					String message = scan.nextLine();
					if (message.equals("quit"))
						break;
					out.writeUTF("["+name+"]"+message);
				}
				
				out.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//run	
	}//ClientSender
	
	
	//inner class
	static class ClientReceiver extends Thread {
		Socket socket; 
		DataInputStream in;
		public	ClientReceiver(Socket socket) {
			this.socket = socket;
			try{
				in = new DataInputStream(socket.getInputStream());
			}catch(Exception e) { 
				e.printStackTrace(); 
				}
		}//������
		
		public void run() {
			//���� ������ �ִٸ� �ֿܼ� ���
			while(in != null) {
				try{ 
					System.out.println(in.readUTF()); 
				} catch(Exception e) {
					e.printStackTrace();
					break;
				}
			}
			try {
				in.close();
				socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}//ClientReceiver
}//class

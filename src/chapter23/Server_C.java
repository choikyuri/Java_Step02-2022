package chapter23;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_C {

	public static void main(String[] args) {
		
		
		ServerSocket ss=null;
		
		try {
			ss=new ServerSocket(9999); //1��
			System.out.println("Server ready....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			
			try {
				Socket socket=ss.accept(); //��� 2��
				System.out.println("client connect success!");
				//Ŭ���̾�Ʈ ���� �о����
				InputStream in=socket.getInputStream();//���� �о���̴� ��Ʈ��
				DataInputStream dis=new DataInputStream(in); //�ѱ۱��� ����
				String message=dis.readUTF();
				
				OutputStream out=socket.getOutputStream();
				DataOutputStream dos=new DataOutputStream(out);
				dos.writeUTF("[ECHO]"+message+"(from Server)");
				
				dos.close();
				dis.close();
				socket.close(); //�������
				System.out.println("client scoket close...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//while
	}//main
}//class

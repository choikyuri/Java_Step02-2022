package chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_C {

	public static void main(String[] args) {
		try {
			Socket socket=new Socket("172.16.10.18",9999); //accept()
			System.out.println("Connection Success!");
			Scanner scan=new Scanner(System.in);
			System.out.print("�Է� : ");
			//�Է�
			String message=scan.nextLine();
			//������ �޼��� ����
			OutputStream out=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(out);
			dos.writeUTF(message);
			//�����κ��� �޼��� �ٽ� ����
			InputStream in=socket.getInputStream();//���� �о���̴� ��Ʈ��
			DataInputStream dis=new DataInputStream(in); //�ѱ۱��� ����
			System.out.print("Receive : "+dis.readUTF());
			
			dis.close();
			dos.close();
			socket.close();	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

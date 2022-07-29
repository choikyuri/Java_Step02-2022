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
			System.out.print("입력 : ");
			//입력
			String message=scan.nextLine();
			//서버로 메세지 보냄
			OutputStream out=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(out);
			dos.writeUTF(message);
			//서버로부터 메세지 다시 받음
			InputStream in=socket.getInputStream();//정보 읽어들이는 스트림
			DataInputStream dis=new DataInputStream(in); //한글깨짐 방지
			System.out.print("Receive : "+dis.readUTF());
			
			dis.close();
			dos.close();
			socket.close();	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

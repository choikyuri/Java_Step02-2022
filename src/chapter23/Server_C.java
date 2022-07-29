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
			ss=new ServerSocket(9999); //1번
			System.out.println("Server ready....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			
			try {
				Socket socket=ss.accept(); //대기 2번
				System.out.println("client connect success!");
				//클라이언트 정보 읽어오기
				InputStream in=socket.getInputStream();//정보 읽어들이는 스트림
				DataInputStream dis=new DataInputStream(in); //한글깨짐 방지
				String message=dis.readUTF();
				
				OutputStream out=socket.getOutputStream();
				DataOutputStream dos=new DataOutputStream(out);
				dos.writeUTF("[ECHO]"+message+"(from Server)");
				
				dos.close();
				dis.close();
				socket.close(); //통신종료
				System.out.println("client scoket close...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//while
	}//main
}//class

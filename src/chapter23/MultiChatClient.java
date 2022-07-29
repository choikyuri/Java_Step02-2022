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
		//오버로딩
		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;
			try {
				out=new DataOutputStream(socket.getOutputStream());//통신 정보 보내기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//생성자

		@Override
		public void run() {
			Scanner scan=new Scanner(System.in);
			try {
				if(out != null)  //연결이 되있다면
					out.writeUTF(name); //이름도 저장하여 보내기
				
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
		}//생성자
		
		public void run() {
			//읽을 내용이 있다면 콘솔에 출력
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

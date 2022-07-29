package chapter23;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer {
     HashMap clients;
     
     public MultiChatServer() {
    	 clients =new HashMap();
    	 //HashMap�� Hashtable�� ���ؼ� �ӵ��� �����ݸ� ��Ƽ ������ ����� ����ȭ�� ���� ���Ѵ�
    	 //�׷��Ƿ�  Collections.synchronizedMap���� ����ȭ ������ ����Ѵ�
    	 Collections.synchronizedMap(clients);
	}
     
     public void start() {
    	 ServerSocket serverSocket=null;
    	 Socket socket=null;
    	 try {
    		 serverSocket=new ServerSocket(9998);
    		 System.out.println("start Server...");
    		 
    		 while(true) {
    			 socket = serverSocket.accept(); 
    			 System.out.println(socket.getInetAddress()+":"+
    			 socket.getPort()+" connect!");
    			 ServerReceiver thread = new ServerReceiver(socket);
    			 thread.start();
    		 }
    		 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//start
     
    public void sendToAll(String msg) { //��ε�ĳ���� ���
		Iterator iterator=clients.keySet().iterator();
		while(iterator.hasNext()) {
			try {
				DataOutputStream out=
						(DataOutputStream)clients.get(iterator.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} 
	
	public static void main(String[] args) {
		new MultiChatServer().start();

	}//main
	
	//inner class
	class ServerReceiver extends Thread{
		Socket socket; 
		DataInputStream in; 
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket=socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//������

		@Override
		public void run() {
			String name="";
			
			try {
				name=in.readUTF(); //kyuri
				if(clients.get(name) != null) {//���� �̸��� ����
					out.writeUTF("#Aleady exsit name : "+name);
					out.writeUTF("#Please ReConnect by other name ");
					System.out.println(socket.getInetAddress()+" : "+socket.getPort()+"disconnect!");
					in.close();
					out.close();
					socket.close();
					socket=null;
				}else {
					sendToAll("#"+name+" Join~");
					clients.put(name, out);//�̸� ����
					while(in != null) {
						sendToAll(in.readUTF());
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if (socket != null) {
					sendToAll("#"+name+" exit!");
					clients.remove(name);
					System.out.println(socket.getInetAddress()+":"+
							socket.getPort()+" disconnect!");
				}
			}//finally
		}//run
	}//ServerReceiver innerclass
}//MultiChatServer class



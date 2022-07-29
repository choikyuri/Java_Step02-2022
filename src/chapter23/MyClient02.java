package chapter23;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient02 {

	public static void main(String[] args) {
		
		System.out.println("입력 : ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine(); // 입력
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s=null;
			try {
				s=new Socket("172.16.10.30", 3001); //서버접속

				PrintWriter out=new PrintWriter(s.getOutputStream());
				
				out.write(msg); //서버로 보내기
				
				//스트림에 적재된 내용 비워줌
				out.flush();
				
				if(out != null) {
					out.close(); //스트림 닫기
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					
					if(s != null) {
						s.close(); //소켓닫기
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}

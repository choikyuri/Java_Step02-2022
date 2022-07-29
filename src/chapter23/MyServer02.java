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
			 서버소켓을 생성할시에 서비스 포트번호를 지정하여 클라이언트와 접속할수 있도록 설정한다
			 포트번호는 보안상 2000번 이후 번호를 권장한다
			 */
			ss=new ServerSocket(3001); //서버준비 완료
			
			System.out.println("서버 준비 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public static void main(String[] args) {
		new MyServer02().start(); //프로그램 시작

	}


	@Override
	public void run() {
		
		while(true) {
			//접속허용하고 바로 문자열을 받아내서 출력
			try {
				Socket s=ss.accept();
				
				//클라이언트가 접속하자마자 문열을 보내기 때문에 보조스트림을 이용하여 바로 받아낸다
				BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
				String ip=s.getInetAddress().getHostAddress();
				String msg=reader.readLine(); //접속자가 보낸메세지 저장
				
				System.out.println(ip+" : "+msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	

}

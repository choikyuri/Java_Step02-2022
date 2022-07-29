package chapter23;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer01 extends Thread{
	
	ServerSocket ss;
	
	public MyServer01() {
		
		try {
			/*
			 서버소켓을 생성할시에 서비스 포트번호를 지정하여 클라이언트와 접속할수 있도록 설정한다
			 포트번호는 보안상 2000번 이후 번호를 권장한다
			 */
			ss=new ServerSocket(3000); //서버준비 완료
			
			System.out.println("서버 준비 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	

	@Override
	public void run() {
		// 서버는 무한반복을 하면서 클라이언트의 접속을 기다린다
		while(true) {
			
			try {
				Socket s=ss.accept(); //클라이언트 요청에 동의하여 접속자를 받아들인다는 뜻
				//즉 접속자가 올때까지 아래의 내용을 수행하지 않고 무한대기 상태를 유지
				
				//포트로 접속이 완료되면 클라이언트의 ip주소를 가져온다
				String ip=s.getInetAddress().getHostAddress();
				
				System.out.println(ip+"님 왔다 감!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		MyServer01 ms=new MyServer01();
		ms.start();
		
		//new MyServer01().start();
		//현재 객체가 Thread로부터 상속 받았으므로 자신이 곧 스레드가 됨
		//그러므로 생성되자마자 start()를 호출하여 Thread를 시작시킬수 있음
	}

}

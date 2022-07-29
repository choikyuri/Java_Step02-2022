package chapter23;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient02 {

	public static void main(String[] args) {
		
		System.out.println("�Է� : ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine(); // �Է�
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s=null;
			try {
				s=new Socket("172.16.10.30", 3001); //��������

				PrintWriter out=new PrintWriter(s.getOutputStream());
				
				out.write(msg); //������ ������
				
				//��Ʈ���� ����� ���� �����
				out.flush();
				
				if(out != null) {
					out.close(); //��Ʈ�� �ݱ�
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					
					if(s != null) {
						s.close(); //���ϴݱ�
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}

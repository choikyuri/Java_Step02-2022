package chapter22;

public class Thread_test1 extends Thread{
	
	@Override
	public void run() {//������ Ŭ�������� ������ �۵��� ���� run()�޼��尡 �ִ�.
		
		for(int i = 0; i < 50; i++){
			
			System.out.print("1");
		}
	}
}

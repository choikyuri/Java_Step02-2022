package chapter22;

public class ThreadJoin implements Runnable{
	public static void main(String[] args) {
		
		System.out.println("����Ŭ���� ����");
		ThreadJoin t1 = new ThreadJoin();
		//Runnable t1 = new ThreadJoin();
		Thread mThread = new Thread(t1);//������ ����
		mThread.start();//run()ȣ��
		
		try {
			//join�޼��带 ����ϸ�
			//�ش罺������ run()�޼��尡 ������ �۾��� ��ĥ������
			//���ν����忡�� ������ ��ٸ��� �ȴ�.
			mThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("����Ŭ���� ����");	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run()");
		first();
	}
	
	public void first(){
		System.out.println("first()");
		second();
	}
	
	public void second(){
		System.out.println("second()");
	}
}

package chapter22;

public class Thread_Main implements Runnable{
	public static void main(String[] args) {
		
		System.out.println("����Ŭ���� ����");
		Thread_Main t1 = new Thread_Main();
		//Runnable t1 = new Thread_Ex_Main();
		Thread mThread = new Thread(t1);//������ ����
		mThread.start();//run()ȣ��
		System.out.println("����Ŭ���� ����");
		
		//����� ����
		//���� Ŭ���� ����
		//run()
		//first()
		//second()
		//����Ŭ���� ����
		//���� ������� ���;� �� �� ������ �����δ� �׷��� �ʴ�.
		
		//����Ŭ���� ����
		//����Ŭ���� ����
		//run()
		//first()
		//second()
		//�̷��� ����� �ȴ�.
		
		//����Ŭ������ ����� ���Ŀ�
		//������ ��ü�� ȣ���ϰ�
		//start()�� ����� run()�� ȣ��������
		//run()�� ȣ��Ǳ� ���� 
		//�� �Ʒ����� '����Ŭ���� ����'�� ���� ��µǾ��� ����
		
		//��ó�� �����带 ����ϸ�
		//������ �Ʒ���, �¿��� ��� ��� �ϴ�
		//�۾������� ������ ���� �������� �ִ�.
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

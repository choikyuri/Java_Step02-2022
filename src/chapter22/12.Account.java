package chapter22;

public class Account {
	
	int balance = 1000;//�ܾ�
	
	//��ݸ޼���
	public synchronized void withdraw(int money){
		
		//�ܾ��� ��ݾ׺��� ���� ���
		if(balance < money){
			
			try {
				
				wait();//�����尡 �Ͻ������� �������¿� ����
				
			} catch (Exception e) {
				// TODO: handle exception
			}						
		}
		
		balance -= money;
	}//withdraw()
	
	//�Աݸ޼���
	public synchronized void deposit(int money){
		balance += money;
		notify();//������ �����带 ����
	}
}
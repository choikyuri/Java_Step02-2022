package chapter22;

public class Thread_Ex extends Thread{
	
	private int[] temp;
	
	public Thread_Ex(){//������
		temp = new int[10];
		for(int i = 0; i < temp.length; i++){
			temp[i] = i;
		}
	}
	
	@Override
	public void run() {//������ Ŭ�������� ������ �۵��� ���� run()�޼��尡 �ִ�.
		
		for(int i : temp){
			
			try {
				Thread.sleep(1000);//1�� ���
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("temp : " + temp[i]);
		}
	}
}

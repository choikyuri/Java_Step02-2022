package chapter13;

class Outter{
	//�ܺ� Ŭ������ �ʵ弱��
	int outNum = 100;
	static int sNum = 200;
	
	//�޼��� Runnable Ÿ����  getRunnable(int i)�޼��� ����
	//java.lang.Thread#run()
	Runnable getRunnable(int i){

	int num = 100;//runableŸ���� �ʵ�� �Ű������� finaló�� ���ǰ� ����
	//�޼��� ���ο� Ŭ���� ����
	//���� Ŭ���� - �ܺ� Ŭ�������� �޼��� ó�� ��� ����
	class MyRunnable implements Runnable{

 		int localNum = 10;
			
		@Override
		public void run() {
		       //num = 200;   //���� ��. ���������� ����� �ٲ�
		       //i = 100;     //���� ��. �Ű� ���� ���� ��������ó�� ����� �ٲ�
		     System.out.println("i =" + i); 
             System.out.println("num = " +num);  
		     System.out.println("localNum = " +localNum);
					
		     System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
		     System.out.println("Outter.sNum = " + Outter.sNum + "(�ܺ� Ŭ���� ���� ����)");
				}
			}
		 return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
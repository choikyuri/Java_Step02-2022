package chapter13;



class Outter2{
	//�͸�Ŭ������ �ν��Ͻ� �̸��� ����
	Runnable getRunnable(int i){

		int num = 100;
			
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //���� ��
			//i = 10;      //���� ��
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	//new �� ���ÿ� �θ�Ŭ������ ��ӹ޾� ���ο��� �������̵��ؼ� ����Ѵ�.
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnerble = out.getRunnable(10);
		/*
		 * runnerble�� ���ؼ� getRunnable�޼ҵ尡 ����ǰ� ���� 
		 * ��� �Ű������� ���������� �Ҹ�ȴ� �Ҹ�� ���������� �Ű�������
		 * ������ �� �� �����Ƿ� runnableŸ���� ���������� �Ű������� 
		 * ���������� finalŸ������ ����ϰ� �ִ�
		 */

		runnerble.run();
		out.runner.run();
	}
}

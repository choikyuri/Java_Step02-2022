package chapter22;

public class DaemonMain implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);
		
		//t��� �����尡 ���󽺷������� ����ϴ� �޼���.
		//���ν����尡 ����� �� �Բ� ����ǵ��� �Ѵ�.
		t.setDaemon(true);
		
		//run()�޼��� ����
		t.start();
		
		for(int i = 1; i <= 15; i++){
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(i);
			
			if(i == 3)//3�� �ڿ� �ڵ����̺� ����
				autoSave = true;
		}
		
		System.out.println("���α׷� ����");
	}

	@Override
	public void run() {
		
		while(true){
			
			try {
				Thread.sleep(3000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if(autoSave == true)
				System.out.println("�ڵ������� �����մϴ�.");			
		}
	}//run()
}
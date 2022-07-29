package chapter22;

public class DaemonMain implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);
		
		//t라는 스레드가 데몬스레드임을 명시하는 메서드.
		//메인스레드가 종료될 때 함께 종료되도록 한다.
		t.setDaemon(true);
		
		//run()메서드 시작
		t.start();
		
		for(int i = 1; i <= 15; i++){
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(i);
			
			if(i == 3)//3초 뒤에 자동세이브 시작
				autoSave = true;
		}
		
		System.out.println("프로그램 종료");
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
				System.out.println("자동저장을 수행합니다.");			
		}
	}//run()
}
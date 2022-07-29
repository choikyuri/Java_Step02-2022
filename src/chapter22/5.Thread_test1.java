package chapter22;

public class Thread_test1 extends Thread{
	
	@Override
	public void run() {//스레드 클레스에는 스레드 작동을 위한 run()메서드가 있다.
		
		for(int i = 0; i < 50; i++){
			
			System.out.print("1");
		}
	}
}

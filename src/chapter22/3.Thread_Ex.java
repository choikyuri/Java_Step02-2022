package chapter22;

public class Thread_Ex extends Thread{
	
	private int[] temp;
	
	public Thread_Ex(){//생성자
		temp = new int[10];
		for(int i = 0; i < temp.length; i++){
			temp[i] = i;
		}
	}
	
	@Override
	public void run() {//스레드 클레스에는 스레드 작동을 위한 run()메서드가 있다.
		
		for(int i : temp){
			
			try {
				Thread.sleep(1000);//1초 대기
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("temp : " + temp[i]);
		}
	}
}

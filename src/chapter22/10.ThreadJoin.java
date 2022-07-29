package chapter22;

public class ThreadJoin implements Runnable{
	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		ThreadJoin t1 = new ThreadJoin();
		//Runnable t1 = new ThreadJoin();
		Thread mThread = new Thread(t1);//스레드 생성
		mThread.start();//run()호출
		
		try {
			//join메서드를 사용하면
			//해당스레드의 run()메서드가 완전히 작업을 마칠때까지
			//메인스레드에서 응답을 기다리게 된다.
			mThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("메인클래스 종료");	
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

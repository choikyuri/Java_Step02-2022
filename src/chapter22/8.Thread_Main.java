package chapter22;

public class Thread_Main implements Runnable{
	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		Thread_Main t1 = new Thread_Main();
		//Runnable t1 = new Thread_Ex_Main();
		Thread mThread = new Thread(t1);//스레드 생성
		mThread.start();//run()호출
		System.out.println("메인클래스 종료");
		
		//결과를 보면
		//메인 클래스 시작
		//run()
		//first()
		//second()
		//메인클래스 종료
		//위의 순서대로 나와야 할 것 같지만 실제로는 그렇지 않다.
		
		//메인클래스 시작
		//메인클래스 종료
		//run()
		//first()
		//second()
		//이렇게 출력이 된다.
		
		//메인클래스가 실행된 이후에
		//스레드 객체를 호출하고
		//start()를 사용해 run()을 호출했지만
		//run()이 호출되기 전에 
		//그 아래줄인 '메인클래스 종료'가 먼저 출력되었기 때문
		
		//이처럼 스레드를 사용하면
		//위에서 아래로, 좌에서 우로 라고 하는
		//작업순서를 따르게 되지 않을수도 있다.
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

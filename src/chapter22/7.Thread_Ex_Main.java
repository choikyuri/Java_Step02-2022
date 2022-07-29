package chapter22;

public class Thread_Ex_Main {

	public static void main(String[] args) {
		Thread_test1 t1 = new Thread_test1();
		Thread_test2 t2 = new Thread_test2();
		
		t1.start();
		t2.start();
		//실행하면 스레드는 동시에 진행되는 것이 아니라 
		//번갈아가며 실행된다는 것을 알 수 있다.
	}
}
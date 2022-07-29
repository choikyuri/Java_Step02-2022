package chapter22;

public class Thread_test2 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 50; i++){

			System.out.print("2");
		}
	}
}

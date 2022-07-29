package pk23;

import java.util.Scanner;

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {

		System.out.print("값을 입력 : ");
		Scanner scan = new Scanner(System.in);

		ThreadCount t = new ThreadCount(scan.nextInt());
		Thread tt = new Thread(t);		
		tt.start();
	}

	public void run() {		
		for(int i = n; i >= 0; i--){
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}

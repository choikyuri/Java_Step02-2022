package chapter22;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		Thread_Ex t1 = new Thread_Ex();
		t1.start(); //start()메서드를 호출하면 run()메서드 내부의 연산을 처리.

		try{
			Thread.sleep(2000);
			System.out.println("프로그램 종료");	
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}

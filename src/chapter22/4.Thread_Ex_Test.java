package chapter22;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		Thread_Ex t1 = new Thread_Ex();
		t1.start(); //start()�޼��带 ȣ���ϸ� run()�޼��� ������ ������ ó��.

		try{
			Thread.sleep(2000);
			System.out.println("���α׷� ����");	
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}

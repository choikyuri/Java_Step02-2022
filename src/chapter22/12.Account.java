package chapter22;

public class Account {
	
	int balance = 1000;//잔액
	
	//출금메서드
	public synchronized void withdraw(int money){
		
		//잔액이 출금액보다 적을 경우
		if(balance < money){
			
			try {
				
				wait();//스레드가 일시적으로 정지상태에 빠짐
				
			} catch (Exception e) {
				// TODO: handle exception
			}						
		}
		
		balance -= money;
	}//withdraw()
	
	//입금메서드
	public synchronized void deposit(int money){
		balance += money;
		notify();//정지된 스레드를 실행
	}
}
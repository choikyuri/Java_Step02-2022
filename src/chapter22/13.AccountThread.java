package chapter22;

import java.util.Random;

public class AccountThread implements Runnable{

	Account acc;//Account객체 준비
	
	//생성자 정의
	public AccountThread(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {

		while(true){
			
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}			
			
			//출금액을 100 ~ 300원 사이의 난수로 지정
			int money = (new Random().nextInt(3) + 1) * 100;
			acc.withdraw(money);
			System.out.println("잔액 : " + acc.balance);
		}
	}
}

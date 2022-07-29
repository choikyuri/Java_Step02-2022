package chapter22;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {

		Account acc = new Account();

		Runnable r = new AccountThread(acc);
		Thread t1 = new Thread(r);

		t1.start();//스레드 구동

		//스레드와는 별개로 값을받아 입금 시키는
		//코드를 수행할 while()문
		while(true){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
		}
	}
}

package chapter22;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {

		Account acc = new Account();

		Runnable r = new AccountThread(acc);
		Thread t1 = new Thread(r);

		t1.start();//������ ����

		//������ʹ� ������ �����޾� �Ա� ��Ű��
		//�ڵ带 ������ while()��
		while(true){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
		}
	}
}

package chapter13;

import java.util.Scanner;

public class EnumMain {

	public enum Item{
		Start, Pause, Exit
	}

	public static void main(String[] args) {

		while(true){
			System.out.print("숫자를 입력하세요 [0:게임시작, 1:일시정지, 2:게임종료] : ");
			

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();

			Item start = Item.Start;
			Item exit = Item.Exit;
			Item pause = Item.Pause;

			if(n == start.ordinal())
				System.out.println("게임이 시작됨");

			else if(n == pause.ordinal())
				System.out.println("게임이 일시정지됨");

			else{
				System.out.println("게임종료");
				return;
			}
		}	
	}
}

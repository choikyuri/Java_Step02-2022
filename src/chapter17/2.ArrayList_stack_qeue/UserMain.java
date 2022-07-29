package chapter16;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		//ArrayList<UserInfo> arr = new ArrayList<>();
		//요렇게 써도 된다. 근데 난 습관이 돼서 생성할때도 제네릭 타입을 
		//넣는게 좋더라

		outer:while(true){
			
			System.out.print("아이디 생성 : ");		
			Scanner scan = new Scanner(System.in);
			
			//아이디를 입력할때마다 새로운 UserInfo객체 생성
			UserInfo ui = new UserInfo();
			ui.setId(scan.next());
			if(ui.getId().equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
				}
			
			for(int i = 0; i < arr.size(); i++){
				if(ui.getId().equals(arr.get(i).getId())){
					System.out.println("아이디가 중복됩니다. 다른  아이디를 생성하세요");
					continue outer;
				}					
			}
			
			
			
			System.out.print("패스워드 입력 : ");
			Scanner scan2 = new Scanner(System.in);
			ui.setPwd(scan2.nextInt());

			arr.add(ui);

			for(int i = 0; i < arr.size(); i++){
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("------------------------");
			}
		}
	}
}

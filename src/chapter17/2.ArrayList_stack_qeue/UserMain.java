package chapter16;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		//ArrayList<UserInfo> arr = new ArrayList<>();
		//�䷸�� �ᵵ �ȴ�. �ٵ� �� ������ �ż� �����Ҷ��� ���׸� Ÿ���� 
		//�ִ°� ������

		outer:while(true){
			
			System.out.print("���̵� ���� : ");		
			Scanner scan = new Scanner(System.in);
			
			//���̵� �Է��Ҷ����� ���ο� UserInfo��ü ����
			UserInfo ui = new UserInfo();
			ui.setId(scan.next());
			if(ui.getId().equals("exit")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
				}
			
			for(int i = 0; i < arr.size(); i++){
				if(ui.getId().equals(arr.get(i).getId())){
					System.out.println("���̵� �ߺ��˴ϴ�. �ٸ�  ���̵� �����ϼ���");
					continue outer;
				}					
			}
			
			
			
			System.out.print("�н����� �Է� : ");
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

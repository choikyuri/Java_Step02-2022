package chapter16.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableMain {

	public static void main(String[] args) {
		
		Map<String, String> map=new Hashtable<>();
		
		map.put("spring", "45");
		map.put("summer", "78");
		map.put("fall", "910");
		map.put("winter", "123");
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ����� �Է��ϼ��� ");
			System.out.print("���̵� : ");
			String id=scan.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				System.out.print("��й�ȣ : ");
				String password=scan.nextLine();
				System.out.println();
				if(map.get(id).equals(password)) {
					System.out.println("�α��� ����");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}//inner if
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}//outer if
		}//while
	}
}

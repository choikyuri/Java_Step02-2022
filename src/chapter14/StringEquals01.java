package chapter14;

public class StringEquals01 {
	
	public static void main(String[] args) {
		String strVar1=new String("������");//X heap
		String strVar2="������";//���Ǯ
		

		
		if(strVar1==strVar2) {
			System.out.println("���� String��ü�� ����");
		}else {
			System.out.println("�ٸ� String��ü�� ����");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
		    System.out.println("�ٸ� ���ڿ��� ����");
		}
		
	}

}

package chapter14;

import javax.swing.JOptionPane;

public class WrapperTest {

	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		double num1, num2;
		char ch=65; //ch='A';
		
		//�ڵ�UnBoxing
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		
		if(num2 != 0) {
			System.out.println(num1/num2);
		}
		//��õ� char���� �������� ���θ� �Ǵ��Ͽ� true. false�� �����ϰ��Ҷ� ���
		//����ڽ�
		//isDigit(): ���ڿ��θ� �Ǵ�
		if(Character.isDigit(ch)) {
			System.out.println(ch +"�� ���ڰ� �ƴմϴ�.");
		}
		  System.out.println(ch +"�� �����Դϴ�.");
		
	}
}

package chapter14;

import javax.swing.JOptionPane;

public class WrapperTest {

	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		double num1, num2;
		char ch=65; //ch='A';
		
		//자동UnBoxing
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		if(num2 != 0) {
			System.out.println(num1/num2);
		}
		//명시된 char값이 숫자인지 여부를 판단하여 true. false로 리턴하고할때 사용
		//오토박싱
		//isDigit(): 숫자여부를 판단
		if(Character.isDigit(ch)) {
			System.out.println(ch +"는 문자가 아닙니다.");
		}
		  System.out.println(ch +"는 문자입니다.");
		
	}
}

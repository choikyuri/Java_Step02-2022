package pk13;

import javax.swing.JOptionPane;

//out class
class Out{
	static int a=1; //��ü���� ���� ��밡�� (������)
	int b;
	
	//inner class
	public static class In{

		String Infun() {
			
			return(a+"��° Static���� Ŭ�����Դϴ�.");
		}
	}
}


public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		Out.In obj=new Out.In(); //static�̹Ƿ� Ŭ���� �̸����� ����ȣ��
		
		str=obj.Infun();
		JOptionPane.showMessageDialog(null,str+"\n success!");
		

	}

}

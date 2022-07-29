package pk13;

import javax.swing.JOptionPane;

//out class
class Out{
	static int a=1; //객체생성 없이 사용가능 (독립적)
	int b;
	
	//inner class
	public static class In{

		String Infun() {
			
			return(a+"번째 Static내부 클래스입니다.");
		}
	}
}


public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		Out.In obj=new Out.In(); //static이므로 클래스 이름으로 직접호출
		
		str=obj.Infun();
		JOptionPane.showMessageDialog(null,str+"\n success!");
		

	}

}

package pk13;

import javax.swing.JOptionPane;

class Out2{
	static int a=1;
	
	
	public class In{
		
		String Infun() {
			return(a+"번째 Non-Static 내부 클래스입니다");
		}
	}
}

public class NonStaticTest {

	public static void main(String[] args) {
		String str="";
		
		//바깥 클래스 객체
		Out2 obj1=new Out2();
		
		//내부 클래스 객체	
		Out2.In obj2=obj1.new In();
		
		//내부(안쪽)클래스의 메서드에 접근
		str=obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n success!");
		

	}

}

package chapter14;

public class StringEquals01 {
	
	public static void main(String[] args) {
		String strVar1=new String("윤성원");//X heap
		String strVar2="윤성원";//상수풀
		

		
		if(strVar1==strVar2) {
			System.out.println("같은 String객체를 참조");
		}else {
			System.out.println("다른 String객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 참조");
		}else {
		    System.out.println("다른 문자열을 참조");
		}
		
	}

}

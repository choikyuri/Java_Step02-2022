package chapter19;

interface PrintString{
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
        //�Լ��� ����ó�� ���
		PrintString lambdaStr = s->System.out.println(s);  //���ٽ��� ������ ����
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);  //�޼��� �Ű������� ����
		
		PrintString reStr = returnString();  
		reStr.showString("hello ");
		
	}
	//Main�� static�̹Ƿ� static method
	public static void showMyString(PrintString p ){
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {  //��ȯ ������ ���
		return s->System.out.println(s + "world");
	}
}

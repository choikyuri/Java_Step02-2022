package chapter10;

public class CalcMain {

	public static void main(String[] args) {
		
		//���1
		int plus=calc(new CalcPlus(), 20, 10); //Calc c1=new CalcPlus();
		System.out.println("�μ��� �� : "+plus);
		//���2
		System.out.println("�μ��� �� : "+calc(new CalcPlus(), 40, 10));
        System.out.println("=============================");
        
        int minus = calc(new CalcMinus(), 20, 10); //Calc c1=new CalcMinus();
		System.out.println("�� ���� �� : "+minus);
		System.out.println("�� ���� �� : "+calc(new CalcMinus(), 20, 10));
		
		
	}
	
	public static int calc(Calc c1, int a, int b) {
		return c1.getResult(a, b);
	}
	
		

}

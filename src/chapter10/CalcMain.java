package chapter10;

public class CalcMain {

	public static void main(String[] args) {
		
		//방법1
		int plus=calc(new CalcPlus(), 20, 10); //Calc c1=new CalcPlus();
		System.out.println("두수의 합 : "+plus);
		//방법2
		System.out.println("두수의 합 : "+calc(new CalcPlus(), 40, 10));
        System.out.println("=============================");
        
        int minus = calc(new CalcMinus(), 20, 10); //Calc c1=new CalcMinus();
		System.out.println("두 수의 차 : "+minus);
		System.out.println("두 수의 차 : "+calc(new CalcMinus(), 20, 10));
		
		
	}
	
	public static int calc(Calc c1, int a, int b) {
		return c1.getResult(a, b);
	}
	
		

}

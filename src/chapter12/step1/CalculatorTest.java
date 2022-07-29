package chapter12;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		
		//Calc calc1 =new CompleteCalc();
		//calc1.showInfo();//오류 Calc 클래스에 선언되어 있지 않아서 오류
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		
	}
}

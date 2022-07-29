package chapter12;

public interface Calc {
	//hip memory
	//아무것도 선언하지 않아도 public static final double PI=3.14가 됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	//public abstract int add(int num1, int num2);와 같음
	/*public abstract 생략*/ int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}

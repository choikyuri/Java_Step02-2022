package chapter12;

public interface Calc {
	//hip memory
	//�ƹ��͵� �������� �ʾƵ� public static final double PI=3.14�� ��
	double PI = 3.14;
	int ERROR = -999999999;
	
	//public abstract int add(int num1, int num2);�� ����
	/*public abstract ����*/ int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}

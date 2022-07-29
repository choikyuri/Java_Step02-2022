package chapter12;

//상속받은 Calc추상 클래스에서 일부만 구현 되었으므로 추상클래스
//타입상속(type inheritence)
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}

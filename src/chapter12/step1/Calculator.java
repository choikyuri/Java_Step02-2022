package chapter12;

//��ӹ��� Calc�߻� Ŭ�������� �Ϻθ� ���� �Ǿ����Ƿ� �߻�Ŭ����
//Ÿ�Ի��(type inheritence)
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

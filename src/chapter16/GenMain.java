package test;

public class GenMain {

	public static void main(String[] args) {
		Gen gen = new Gen();
		
		// ������
		Integer[] iArr = {1, 2, 3, 4, 5};

		// ������
		Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};

		// Character
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};

		//���׸� �̿�
		//���� �迭���� int, double, char�� ���� �⺻�ڷ������� ������ٸ�
		//�Ʒ��� �޼��忡 �����Ҽ� ����.
		//���׸� Ÿ���� �ݵ�� ��ü�� ó���Ϸ� �Ǿ��ִ�.
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}
}
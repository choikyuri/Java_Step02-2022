package test;



//GenEx_MainŬ���� ����
public class GenEx_Main {
	public static void main(String[] args) {
		// ����ڰ� ���ϴ� ���·� ��ü ����
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");

		System.out.println(v1.getValue());

		// ������ ������ GenEx��ü�� ��������!
		// ���׸� Ÿ���� �⺻�ڷ����� �ν����� ����
		// ���� int, double���� �⺻�ڷ����� ���׸�Ÿ������ �̿��ϰ��� �� ��		// �� Integer, Double���� Ŭ������ �̿��ؾ� �Ѵ�. 
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(1000);
		System.out.println(v2.getValue()+10);

		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());

		GenEx<Double> v4 = new GenEx<Double>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	}
}

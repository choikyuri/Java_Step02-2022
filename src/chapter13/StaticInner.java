package test;

public class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner{
		//����Ŭ������ static������ �ִٸ� 
		//���� Ŭ������ static���� �����ؾ� �Ѵ�.
		static int d = 1000;

		public void getData(){
			//System.out.println("int a : " + a); ����
			//System.out.println("int b : " + b); ����

			//����躯�� a �� b�� static�� �ƴϱ� ������ 
			//staticŬ���� ���ο��� ���� �� ����.

			System.out.println("static int c : " + c);
		}
	}
	public static void main(String[] args) {		
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.getData();

		//����ƽ Ŭ������ �ܺ� Ŭ������ ���� ���� �ٷ� ��ü������ ����
		//Inner inner = new Inner();
		//inner.getData();
	}
}

package test;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//��� ����Ŭ���� ����
	class Inner{
		public void printData(){
			System.out.println("int a : " + a);
			System.out.println("private int b: " + b);
			System.out.println("static int c : " + c);
		}
	}
	
	public static void main(String[] args) {
		MemberInner outer = new MemberInner(); //MainŬ���� ��ü ����
		
		//����Ŭ����(MemberInner)�� ����Ŭ����(Inner)�� ��ü inner�� 
		//����Ŭ���� ��ü(outer)�� ���� ����Ŭ���� ��üȭ(new Inner())
		MemberInner.Inner inner = outer.new Inner();		
	  //MemberInner.Inner inner = new MemberInner().new Inner(); //���ٷ�
		
		inner.printData();
	}
}

package test;

public class AnonyInner {
	
	//test()�Լ� ����
	public void test(){
		
		//�͸�Ŭ����. �������̽��� ������ ���̱� ������ �������̵��� �ʼ���
		new TestInter(){ 
			
			@Override
			public void printData() {
				System.out.println("�͸�Ŭ���� printData()");
				
			}//�߻�޼��� ������	
			
		}.printData();//�������� �������� printData()�Լ��� ȣ������� �Ѵ�.
	}
	
	public static void main(String[] args) {
		
		//����Ŭ���� ��ü�� �����ϰ�
		//�� ��ü�� ���� test()�Լ��� ȣ���Ѵ�.
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
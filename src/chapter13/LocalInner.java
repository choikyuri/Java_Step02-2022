package test;

public class LocalInner {
	
	int a = 100;
	
	//innerTest�Լ� ����
	public void innerTest(int n){
		int b = 200;//��������
		final int c = n;//���
		
		//innerTest()�Լ� ���ο� ��������Ŭ���� �ۼ�
		class Inner{
			//Local���� Ŭ������ �ܺ� Ŭ����(LocalInner)�� ��������
			//����鸸 ������ �� �ִ�.
			
			public void getData(){
				System.out.println("int a : " + a);
				//System.out.println("int b : " + b);����
				System.out.println("final int c : " + c);
			}
		}//���� Ŭ������ ��
		
		//��������Ŭ������� �ؼ� ���� ����� �� �ִ� ���� �ƴϰ�
		//�Ϲ� Ŭ����ó�� ��ü������ �ݵ�� �ʿ��ϴ�
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		LocalInner outer = new LocalInner();//����Ŭ���� ��ü ����
		
            outer.innerTest(500);//outer�� ���ǵǾ� �ִ� �Լ�(����Ŭ������ �ƴϴ�!)ȣ��
	}
}


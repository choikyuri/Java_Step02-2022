package chapter22;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadEx t = new ThreadEx();
		t.start();//run()�޼��带 ȣ���ϴ� �޼���
		//t.run();�� run()�޼��带 ���������� �������� ���Ѵ�.
		//��, �Ϲ� �޼���ó�� ȣ���ع���.
		//run()�޼����� ������ ������ �����ϰ� �ʹٸ�
		//t.start()�� �̿��ؾ� ��.
		System.out.println("main����");

	}

}

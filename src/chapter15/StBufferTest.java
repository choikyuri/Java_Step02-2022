package chapter14;

public class StBufferTest {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer("Nice Day");
		
		//StringBuffer ���ڿ� ó��
		System.out.println(buf.toString());
		//StringBuffer ũ��
		System.out.println(buf.length()); //8
		//StringBuffer �뷮(�⺻ 16���ٰ� ���ڿ����� ����)
		System.out.println(buf.capacity());//24
		buf.ensureCapacity(51);//30
		//�뷮�� �Ѿ�� (�����ִ¿뷮*2+2)�� Ȯ������� Ȯ��뷮���� �Ѿ�� ��û�� �뷮���� Ȯ���� 
		System.out.println(buf.capacity());
		//���ο� ���� �߰�
		buf.insert(0, "Hi! ");
		buf.insert(12, " Everubody!");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
		
		

	}

}

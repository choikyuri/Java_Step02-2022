package chapter14;

public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i=new Integer(100); //(deprecated ����� ������������)
		
		Integer num=100;//����ڽ� �Ϲ��ڷ�=>Ŭ���� 
		
		int iNum=num.intValue(); //��ڽ� Integer Ŭ���� -> int �Ϲ��ڷ������� ��ȯ
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//��ڽ�(Integer -> int)
		int total=num+jNum;//num.intValue() +jNum�� ����
		System.out.println(total);
		//����ڽ�(int -> Integer)
		Integer i=jNum;
		System.out.println(i);//Integer.valueOf(jNum)�� ��ȯ���ذͰ� ����

	}

}

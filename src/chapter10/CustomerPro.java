package chapter10;

import chapter09.Customer;
/*
 // protected�� ����
//����� �޾��� ��� protected�� public���� ���ȴ�
public class CustomerPro extends Customer{
	
    
	public void test() {
		double sum=bonusRatio+5000;
		System.out.println(customerID);
	}

}
*/
//�ٸ� ��Ű������ ����� �ȹް� ��ü�� ���Խ� protected�� private���� ���ȴ�
public class CustomerPro {

	public static void main(String[] args) {
		 Customer cs=new Customer();
		 cs.bonusPoint=0.7;
	}

}


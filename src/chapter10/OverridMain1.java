package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridMain1 {

	public static void main(String[] args) {
		//�θ�=�ڽ�
		Customer vc=new VIPCustomer(2022, "������", 1004);
		vc.bonusPoint=1000;
		
		System.out.println(vc.getCustomerName()+"���� �����ϼž� �� �ݾ��� "+vc.calcPrice(10000)+"���Դϴ�");
		System.out.println(vc.getCustomerName()+"���� bonusPoint�� "+vc.bonusPoint+"���Դϴ�");
		System.out.println(vc.getCustomerName()+"���� ��� ������ "+vc.getAgentID());

	}

}

package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridMain1 {

	public static void main(String[] args) {
		//부모=자식
		Customer vc=new VIPCustomer(2022, "나몰라", 1004);
		vc.bonusPoint=1000;
		
		System.out.println(vc.getCustomerName()+"님이 지불하셔야 할 금액은 "+vc.calcPrice(10000)+"원입니다");
		System.out.println(vc.getCustomerName()+"님의 bonusPoint는 "+vc.bonusPoint+"원입니다");
		System.out.println(vc.getCustomerName()+"님의 담당 상담원은 "+vc.getAgentID());

	}

}

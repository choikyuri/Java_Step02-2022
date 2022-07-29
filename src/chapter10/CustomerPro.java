package chapter10;

import chapter09.Customer;
/*
 // protected의 예제
//상속을 받았을 경우 protected는 public으로 사용된다
public class CustomerPro extends Customer{
	
    
	public void test() {
		double sum=bonusRatio+5000;
		System.out.println(customerID);
	}

}
*/
//다른 패키지에서 상속을 안받고 객체로 진입시 protected는 private으로 사용된다
public class CustomerPro {

	public static void main(String[] args) {
		 Customer cs=new Customer();
		 cs.bonusPoint=0.7;
	}

}


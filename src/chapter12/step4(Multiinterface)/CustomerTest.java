package chapter12;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("----Buy----");
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); //Override�� order�� ȣ���
		System.out.println("----Sell----");
		Sell seller = customer;
		seller.sell();
		seller.order(); //Override�� order�� ȣ��� �� customer
		
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			System.out.println("-Down Chasting -");
			customer2.buy();
			customer2.sell();
		}
		System.out.println("--Customer--");
		customer.order();
	}
}



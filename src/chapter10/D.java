package chapter10;

import chapter09.A;

public class D extends A{
	
	public D(){
		super();
		this.field="value";
		this.method();
	}
	
	public static void main(String[] args) {
		D d=new D();
		d.method();

	}

}

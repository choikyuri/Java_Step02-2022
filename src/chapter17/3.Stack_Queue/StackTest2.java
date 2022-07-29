package chapter16.stack_Queu;

import java.util.ArrayList;

class MyStack{
	 
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("������ ��� �ֽ��ϴ�");
			return null;
		}
		return(arrayStack.remove(len-1));
	}

	@Override
	public String toString() {
		
		return arrayStack.toString();
	}
	
	
	
}


public class StackTest02 {
	
	public static void main(String[] args) {
		
		MyStack stack=new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.toString());
		
		
		
		
	}

}

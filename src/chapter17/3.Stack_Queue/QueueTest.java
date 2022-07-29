package chapter16.stack_Queu;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		//����ó��
		if(len==0) {
			System.out.println("ť�� ����ֽ��ϴ�");
			return null;
		}
		return (arrayQueue.remove(0));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return arrayQueue.toString();
	}
	
	
}


public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue=new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.toString());
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		System.out.println(queue.toString());
	}

}













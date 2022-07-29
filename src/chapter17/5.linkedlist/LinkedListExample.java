package chapter17.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
			//System.err.println(list1);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	}
}
/*두 메소드 모두 Object의 값을 String으로 변환하지만 
 * 변경하고자 하는Object가 null인 경우는
 * toString()과 같은 경우 Null PointerException(NPE)을 발생시키지만 
 * valueOf는 "null"이라는 문자열로 처리한다.
 */

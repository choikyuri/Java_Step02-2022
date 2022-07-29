package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) *-1 ;
	}
}

public class ComparatorTest2 {
	
	public static void main(String[] args) {
		//String에서 override된 오름차순
		Set<String> set = new TreeSet<String>();
		//Comparator를 활용한 내림차순 
		//Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
				
		System.out.println(set);
	}
}

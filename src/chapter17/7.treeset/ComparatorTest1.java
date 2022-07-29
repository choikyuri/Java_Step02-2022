package chapter17.treeset;

import java.util.Set;
import java.util.TreeSet;


public class ComparatorTest1 {
	
	public static void main(String[] args) {
		//string 클래스에서 갖고 있는 default 로 정렬
		Set<String> set = new TreeSet<String>();
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
	
		System.out.println(set);
	}
}

package chapter17.treeset;

import java.util.Set;
import java.util.TreeSet;


public class ComparatorTest1 {
	
	public static void main(String[] args) {
		//string Ŭ�������� ���� �ִ� default �� ����
		Set<String> set = new TreeSet<String>();
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
	
		System.out.println(set);
	}
}

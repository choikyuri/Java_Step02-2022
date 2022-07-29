package chapter17.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//equals와 hashcode가 Override된 String Type
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
			
		//boolean b1 =hashSet.add(new String("강감찬"));
		//System.out.println(b1);
		
		System.out.println(hashSet);
		
		hashSet.add(new String("강감찬"));
		//같은 엘리먼트는 중복을 허용하지 않는다
		//boolean b2 =hashSet.add(new String("강감찬"));
		//System.out.println(b2);
		
		System.out.println(hashSet);
	}
}

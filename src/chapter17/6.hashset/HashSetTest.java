package chapter17.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//equals�� hashcode�� Override�� String Type
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
			
		//boolean b1 =hashSet.add(new String("������"));
		//System.out.println(b1);
		
		System.out.println(hashSet);
		
		hashSet.add(new String("������"));
		//���� ������Ʈ�� �ߺ��� ������� �ʴ´�
		//boolean b2 =hashSet.add(new String("������"));
		//System.out.println(b2);
		
		System.out.println(hashSet);
	}
}

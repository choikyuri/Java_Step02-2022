package chapter17;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("������");
		list.add("��������");
		list.add("�����ҹ�");
		
		System.out.println(list);
		
		System.out.println("---------Iterator-----------");
		//�ݺ��� : Iterator
		Iterator<String> it=list.iterator();
		
		//�ݺ��� Ȱ��
		while(it.hasNext()) {
			String v=it.next();//unBoxing
			System.out.println(v);
		}
		
		System.out.println("---------------------");
		
		System.out.println("list[0] : " + list.get(0));
		System.out.println("list[2] : " + list.get(2));
	}

}
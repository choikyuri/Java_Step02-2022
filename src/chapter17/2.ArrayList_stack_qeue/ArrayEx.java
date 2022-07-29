package chapter17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// �迭�� ������ �迭�� ũ�Ⱑ �������߸� �Ѵ�.
		//  int[] ar = new int[10]; �̷�������.
		// ������ List������ size�� �þ��ٰ� �پ��ٰ� �������̴�.
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size():"+list.size());

		list.add(100);
		list.add(20);
		System.out.println("list.size():"+list.size());//2

		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));

		//�ε����� �����ϴ� ������ ���̰� ������ ���� ���� �ӵ��� ������.
		// �װ��� �ذ��ϱ� ���� ���� ������ �ٷ� Iterator��.

		//1) List������ �ڿ��� �ݺ��ڷ� ��ȯ�ϴ�.
		Iterator<Integer> it = list.iterator();

		//2) �ݺ��ڸ� �ݺ������� �����Ѵ�.
		while(it.hasNext()){ // �ݺ��� �ȿ��� Ŀ���� �����ϸ�,
			//���� Ŀ���� ��ġ���� ���� ��ҿ� ��ü�� �ִٸ�...
			int v = it.next(); //unBoxing ��ü�� �⺻�ڷ����� ����.
			System.out.println(v);			
		}
	}
}
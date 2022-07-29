package chapter17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열과 같지만 배열은 크기가 정해져야만 한다.
		//  int[] ar = new int[10]; 이런식으로.
		// 하지만 List구조는 size가 늘었다가 줄었다가 유동적이다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size():"+list.size());

		list.add(100);
		list.add(20);
		System.out.println("list.size():"+list.size());//2

		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));

		//인덱스로 접근하는 구조는 깊이가 있으면 있을 수록 속도가 느리다.
		// 그것을 해결하기 위해 나온 개념이 바로 Iterator다.

		//1) List구조의 자원을 반복자로 변환하다.
		Iterator<Integer> it = list.iterator();

		//2) 반복자를 반복문으로 수행한다.
		while(it.hasNext()){ // 반복자 안에는 커서가 존재하며,
			//현재 커서의 위치에서 다음 요소에 객체가 있다면...
			int v = it.next(); //unBoxing 객체를 기본자료형에 대입.
			System.out.println(v);			
		}
	}
}
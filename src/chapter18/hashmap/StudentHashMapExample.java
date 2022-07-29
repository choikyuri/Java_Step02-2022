package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentHashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		//학번과 이름이 도일한 student를 키로 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		//저장된 총 Entry수 얻기
		System.out.println("총 Entry 수: " + map.size());
	}
}


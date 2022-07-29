package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);//"홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		//반복해서 키를 얻고 값을  map에서 얻어냄
		while(keyIterator.hasNext()) {
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		//map.Entry:Map에 저장되어 있는 key-value 다루기 위해 내부적으로 Entry인터페이스를 정의해 놓은것
		map.remove("홍길동");//키로 map.Entry 제거
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		//반복해서 map.Entry 얻고 키와 값을 얻어냄
		while(entryIterator.hasNext()) {
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();//모든 map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
}

}
package pk17.hashset;

import java.util.HashSet;
import java.util.Random;

public class SetEx {

	public static void main(String[] args) {
		// Set은 값의 중복을 허용하지 않는다.
				//  - HashSet : 정렬이 안됨
				//  - TreeSet : 오름차순		
				HashSet<Integer> hs = new HashSet<Integer>();

				while(true){
					//난수 발생하기
					int v = (int)(Math.random()*45+1);
					//int v = new Random().nextInt(45) + 1;

					hs.add(v);

					if(hs.size() >= 6)
						break;
				}
				System.out.println(hs);
	}
}
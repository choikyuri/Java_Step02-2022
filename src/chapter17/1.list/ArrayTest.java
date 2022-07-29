package chapter16.List;

import java.util.Arrays;
import java.util.List;
public class ArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[]={50,40,30,20,10};
		String sArray[]=new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Hi!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City
		=Arrays.asList("Seoul","Inchon","Busan","Deaeon","Jeju");
		for(int i=0; i<City.size(); i++){
			System.out.println(City.get(i).toString());
		}
		
		/*
		 Arrays.asList는 리스트를 초기화할 때 자주 사용된다. 
		 처음에 다 초기화를 해버리는 Array와 달리 List는 빈 리스트를 만든 후 
		 add를 해주는 식으로만 초기화를 해줄 수 있다는 점이 매우 불편하기 때문이다.

		그런데, 이 Arrays.asList를 사용할 때에는 주의할 점이 있따.
		위 메서드를 사용할 경우, 이를 할당받는 변수는 원래 만들어진 배열의 인스턴스를 가리킨다.
		이런 이유 때문에 위의 방법으로 초기화된 리스트는 ArrayList의 특성(변경이 자유로운)을 갖지 못한다. 

		 */
	}
}
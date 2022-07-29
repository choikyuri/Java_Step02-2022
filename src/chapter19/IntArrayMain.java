package chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayMain {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		List<Integer> list=new ArrayList<Integer>();
		
		
		int sumVal=Arrays.stream(arr).sum();
		int count1=(int)Arrays.stream(arr).count(); //count는 long type 반환
		
		System.out.println(sumVal);
		System.out.println(count1);
		
		//stream을 객체화하여 사용
		IntStream stream=Arrays.stream(arr);//stream 생성
        System.out.println(stream.sum()); //1차 사용
        /*
        //ERROR :한번 사용한 stream은 다시 재사용 불가능
        int count2=(int)stream.count(); //재사용
        System.out.println(count2);
        */
        //==============================================
        
       System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
       
       
       Arrays.stream(arr).boxed(). //스트림 생성
       distinct(). //중복제거
       sorted(Comparator.reverseOrder()). //정렬(내림차순)
       collect(Collectors.toList());
        
	}

}








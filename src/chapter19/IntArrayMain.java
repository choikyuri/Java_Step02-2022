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
		int count1=(int)Arrays.stream(arr).count(); //count�� long type ��ȯ
		
		System.out.println(sumVal);
		System.out.println(count1);
		
		//stream�� ��üȭ�Ͽ� ���
		IntStream stream=Arrays.stream(arr);//stream ����
        System.out.println(stream.sum()); //1�� ���
        /*
        //ERROR :�ѹ� ����� stream�� �ٽ� ���� �Ұ���
        int count2=(int)stream.count(); //����
        System.out.println(count2);
        */
        //==============================================
        
       System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
       
       
       Arrays.stream(arr).boxed(). //��Ʈ�� ����
       distinct(). //�ߺ�����
       sorted(Comparator.reverseOrder()). //����(��������)
       collect(Collectors.toList());
        
	}

}








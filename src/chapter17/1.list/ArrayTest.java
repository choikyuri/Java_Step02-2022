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
		 Arrays.asList�� ����Ʈ�� �ʱ�ȭ�� �� ���� ���ȴ�. 
		 ó���� �� �ʱ�ȭ�� �ع����� Array�� �޸� List�� �� ����Ʈ�� ���� �� 
		 add�� ���ִ� �����θ� �ʱ�ȭ�� ���� �� �ִٴ� ���� �ſ� �����ϱ� �����̴�.

		�׷���, �� Arrays.asList�� ����� ������ ������ ���� �ֵ�.
		�� �޼��带 ����� ���, �̸� �Ҵ�޴� ������ ���� ������� �迭�� �ν��Ͻ��� ����Ų��.
		�̷� ���� ������ ���� ������� �ʱ�ȭ�� ����Ʈ�� ArrayList�� Ư��(������ �����ο�)�� ���� ���Ѵ�. 

		 */
	}
}
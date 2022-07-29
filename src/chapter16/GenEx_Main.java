package test;



//GenEx_Main클래스 정의
public class GenEx_Main {
	public static void main(String[] args) {
		// 사용자가 원하는 형태로 객체 생성
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");

		System.out.println(v1.getValue());

		// 정수를 가지는 GenEx객체를 생성하자!
		// 제네릭 타입은 기본자료형을 인식하지 않음
		// 따라서 int, double등의 기본자료형을 제네릭타입으로 이용하고자 할 때		// 는 Integer, Double등의 클래스를 이용해야 한다. 
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(1000);
		System.out.println(v2.getValue()+10);

		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());

		GenEx<Double> v4 = new GenEx<Double>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	}
}

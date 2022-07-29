package chapter14;

public class ExtendsEx1_Main {

	public static void main(String[] args) {
		ExtendsEx1 v1 = new ExtendsEx1();
		v1.setValue("TEST");
		// 인자가 Object이지만 String이 Object를
		// 상속받았으므로 인자로 가능하다.

		System.out.println(v1.getValue()); // TEST

		//이번에는 정수(int)를 인자로 넣어보자!!
		ExtendsEx1 v2 = new ExtendsEx1();
		v2.setValue(100); // AutoBoxing(자동 형변환 : 기본자료형->객체)

		//int i = (Integer)v2.getValue();//Object를 Integer로 형변환 –강제 형변환
		//예전엔 이렇게 객체로 캐스팅하여 썼어야 했다.↑↑↑↑

		//지금은 이렇게 기본자료형으로 캐스팅해도 사용할수 있도록 바뀐 듯
		//UnBoxing – 객체 -> 기본자료형
		int i = (int)v2.getValue();
		System.out.println(i+1);
	}
}

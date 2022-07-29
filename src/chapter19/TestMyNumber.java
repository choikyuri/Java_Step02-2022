package chapter19;


public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max = (x, y)->(x>= y)? x:y; // 람다식을 인터페이스 자료형 max 변수에 대입
		System.out.println(max.getMax(10, 20));// 인터페이스 자료형 변수로 함수 호출
		

		/*
		int i=1000;
		MyNumber aa=new MyNumber() {
			i=100;//생존 사이클이	int i=1000보다 길어서 참조안됨
			@Override
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/
	}
}

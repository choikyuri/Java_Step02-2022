package test;

public class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner{
		//내부클래스에 static변수가 있다면 
		//내부 클래스를 static으로 정의해야 한다.
		static int d = 1000;

		public void getData(){
			//System.out.println("int a : " + a); 오류
			//System.out.println("int b : " + b); 오류

			//↑↑↑↑변수 a 와 b는 static이 아니기 때문에 
			//static클래스 내부에서 사용될 수 없다.

			System.out.println("static int c : " + c);
		}
	}
	public static void main(String[] args) {		
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.getData();

		//스테틱 클래스는 외부 클래스의 접근 없이 바로 객체생성이 가능
		//Inner inner = new Inner();
		//inner.getData();
	}
}

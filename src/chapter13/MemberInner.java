package test;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//멤버 내부클래스 정의
	class Inner{
		public void printData(){
			System.out.println("int a : " + a);
			System.out.println("private int b: " + b);
			System.out.println("static int c : " + c);
		}
	}
	
	public static void main(String[] args) {
		MemberInner outer = new MemberInner(); //Main클래스 객체 생성
		
		//메인클래스(MemberInner)의 내부클래스(Inner)형 객체 inner는 
		//메인클래스 객체(outer)를 통해 내부클래스 객체화(new Inner())
		MemberInner.Inner inner = outer.new Inner();		
	  //MemberInner.Inner inner = new MemberInner().new Inner(); //한줄로
		
		inner.printData();
	}
}

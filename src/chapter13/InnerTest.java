package chapter13;


//외부 클래스
class OutClass{
	//외부 클래스의 필드
	private int num=0;
	private static int sNum = 20;
	private InClass inClass;
	
	//생성자(Construct)를 통해서 내부클래스 객체가 생성
	public OutClass() {
		inClass=new InClass(); //내부 클래스 생성
	}
	
	//내부클래스(Non-static)
	//인스턴스 내부 클래스 : 외부클래스에서 볼때 멤버변수와 동일
	//인스턴스 내부 클래스에서 사용할 수 있는 변수 : 외부 인스턴스 변수(멤버변수=필드=속성), 외부인스턴스 변수의 전역변수(static)(사용만)
	//객체 생성방법 : 외브클래스 먼저 만든 후 내부 클래스 생성
	class InClass{
		int inNum=100;//내부 클래스의 필드
		//static은 기준이 되고 변경없이 사용하려는 목적이므로 다른곳에서 재정의 할 수 없다
		//static sNum=210; //에러 남
		//static InsNum=200; //인스턴스 클래스에서는 스테이틱 사용 안됨(클래스와 무관하게 생성이 불가능하므로)
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부클래스의 전역 변수)");
		}
		
	}
	
	//외부 클래스의 메서드
	public void usingClass() {
		inClass.inTest();
		
	}
	
//정적 내부 클래스(static)
//정적 내부 클래스 : 외부클래스에서 볼때 멤버변수와 동일
//정적 내부 클래스에서 사용할 수 있는 변수 : 외부인스턴스 변수의 전역변수(static)
//객체 생성방법 : 외브클래스와는 무관하게 내부 클래스 생성
static class InStaticClass{
	//멤버변수
	int inNum=100;
	static int sInNum=200;
	
	void inTest() {
		//외부클래스의 인스턴스 변수를 사용할 수 없는 이유: 
		//스태틱는 첨부터 데이터영역에 잡혀있으며 외부는 인스턴스는 반드시 객체생성을 해야되니까 접근이 불가능
		//num=200;//객체가 있어야 사용가능하므로 불가능 
		inNum=100;
		sInNum=200;
		sNum=300;// 외부 클래스의 스텍틱
		System.out.println("InStaticClass inNum = "+inNum+"(내부 인스턴스 변수)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(내부 static)");
		System.out.println("InStaticClass sInNum = "+sNum+"(외부 static)");
		//System.out.println("InStaticClass sInNum = "+num+"(외부 인스턴스 변수)");
	}
	
	static void sTest() {
		//num+=10;
		//inNum+=10;
		sInNum=200;
		sNum=300;// 외부 클래스의 스텍틱
		System.out.println("OutClass sNum = "+sNum+"(외부 static)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(내부 static)");
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
		//private 으로 변수 접근시 호출
		System.out.println("private 으로 변수 접근시 호출");
		OutClass outClass1=new OutClass();
		outClass1.usingClass();
		System.out.println();
		
		
		//외부 클래스를 먼저 만들고 그 객체를 이용해서 내부 클래스 객체 생성
		OutClass outClass=new OutClass();
		OutClass.InClass inClass=outClass.new InClass();
		System.out.println("일반 내부 클래스의 일반 메서드 호출");
		inClass.inTest();
		System.out.println();
		
		//외부클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스의 일반 메서드 호출");
		sInClass.inTest();
		System.out.println("정적 내부 클래스의 static 메서드 호출");
		sInClass.sTest();
		System.out.println("클래스명으로 직접 접근");
		OutClass.InStaticClass.sTest();;


	}

}

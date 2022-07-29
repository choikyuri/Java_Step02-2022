package test;

public class AnonyInner {
	
	//test()함수 정의
	public void test(){
		
		//익명클래스. 인터페이스를 생성한 것이기 때문에 오버라이딩이 필수다
		new TestInter(){ 
			
			@Override
			public void printData() {
				System.out.println("익명클래스 printData()");
				
			}//추상메서드 재정의	
			
		}.printData();//마지막에 재정의한 printData()함수를 호출해줘야 한다.
	}
	
	public static void main(String[] args) {
		
		//메인클래스 객체를 생성하고
		//그 객체를 통해 test()함수를 호출한다.
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
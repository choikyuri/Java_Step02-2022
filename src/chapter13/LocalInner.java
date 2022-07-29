package test;

public class LocalInner {
	
	int a = 100;
	
	//innerTest함수 정의
	public void innerTest(int n){
		int b = 200;//지역변수
		final int c = n;//상수
		
		//innerTest()함수 내부에 지역내부클래스 작성
		class Inner{
			//Local내부 클래스는 외부 클래스(LocalInner)의 멤버면수와
			//상수들만 접근할 수 있다.
			
			public void getData(){
				System.out.println("int a : " + a);
				//System.out.println("int b : " + b);오류
				System.out.println("final int c : " + c);
			}
		}//내부 클래스의 끝
		
		//지역내부클래스라고 해서 직접 사용할 수 있는 것은 아니고
		//일반 클래스처럼 객체생성이 반드시 필요하다
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		LocalInner outer = new LocalInner();//메인클래스 객체 생성
		
            outer.innerTest(500);//outer에 정의되어 있는 함수(내부클래스가 아니다!)호출
	}
}


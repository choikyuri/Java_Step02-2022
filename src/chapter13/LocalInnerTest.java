package chapter13;

class Outter{
	//외부 클래스의 필드선언
	int outNum = 100;
	static int sNum = 200;
	
	//메서드 Runnable 타입의  getRunnable(int i)메서드 생성
	//java.lang.Thread#run()
	Runnable getRunnable(int i){

	int num = 100;//runable타입의 필드와 매개변수는 final처럼 사용되고 있음
	//메서드 내부에 클래스 생성
	//지역 클래스 - 외부 클래스에서 메서드 처럼 사용 가능
	class MyRunnable implements Runnable{

 		int localNum = 10;
			
		@Override
		public void run() {
		       //num = 200;   //에러 남. 지역변수는 상수로 바뀜
		       //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
		     System.out.println("i =" + i); 
             System.out.println("num = " +num);  
		     System.out.println("localNum = " +localNum);
					
		     System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
		     System.out.println("Outter.sNum = " + Outter.sNum + "(외부 클래스 정적 변수)");
				}
			}
		 return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
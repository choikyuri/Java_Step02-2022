package chapter13;



class Outter2{
	//익명클래스는 인스턴스 이름이 없다
	Runnable getRunnable(int i){

		int num = 100;
			
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	//new 와 동시에 부모클래스를 상속받아 내부에서 오버라이딩해서 사용한다.
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnerble = out.getRunnable(10);
		/*
		 * runnerble에 의해서 getRunnable메소드가 실행되고 나면 
		 * 모든 매개변수와 지역변수는 소멸된다 소멸된 지역변수와 매개변수를
		 * 재정의 할 수 없으므로 runnable타입의 지역변수와 매개변수는 
		 * 묵시적으로 final타입으로 사용하고 있다
		 */

		runnerble.run();
		out.runner.run();
	}
}

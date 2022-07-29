package chapter22;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadEx t = new ThreadEx();
		t.start();//run()메서드를 호출하는 메서드
		//t.run();은 run()메서드를 독립적으로 수행하지 못한다.
		//즉, 일반 메서드처럼 호출해버림.
		//run()메서드의 내용을 별개로 수행하고 싶다면
		//t.start()를 이용해야 함.
		System.out.println("main종료");

	}

}

package chapter19;

//lambda expression

@FunctionalInterface
public interface Add {
  //인터페이스로 구현하되 추상메서드는 단 하나만 올 수 있다.
	public int add(int x, int y);
	//public int num(int a);
}
//자바 8부터 지원, 클래스를 생성하지 않고  함수의 호출만으로 기능 수행
//입력받은 자료를 기반으로 수행되므로 외부의 영향을 받지 않아 병렬처리에 유리하다
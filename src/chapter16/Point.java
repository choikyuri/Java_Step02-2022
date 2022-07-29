package chapter16;

public class Point<T,V> {

	//멤버변수
	T x;
	V y;
	//생성자 메서드
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	//get으로 반환
	public  T getX() {
		return x;
	}

	public V getY() {
		return y;
    }
}

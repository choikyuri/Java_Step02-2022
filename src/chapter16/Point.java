package chapter16;

public class Point<T,V> {

	//�������
	T x;
	V y;
	//������ �޼���
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	//get���� ��ȯ
	public  T getX() {
		return x;
	}

	public V getY() {
		return y;
    }
}

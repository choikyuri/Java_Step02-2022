package chapter16;

public class GenericMethod {
	//static <T,V>라는 두개의 매개변수를 갖고 있는 제네릭 타입의 makeRectangle(p1,p2) 메서드
		public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
			double left = ((Number)p1.getX()).doubleValue();//왼쪽 T에서 
			double right =((Number)p2.getX()).doubleValue();//오른쪽 T
			double top = ((Number)p1.getY()).doubleValue();//위 V에서
			double bottom = ((Number)p2.getY()).doubleValue();//아래 V
			
			double width = right - left;
			double height = bottom - top;
			
			return width * height;
		}
		
		public static void main(String[] args) {
			
			Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
			Point<Integer, Double> p2 = new Point<>(10, 10.0);
			
			double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
			System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		}
}

package chapter14;

//복제는 private에 위배되므로 반드시 Cloneable를 선언해갸 허용된다 
class Circle implements Cloneable{
	
	Point point; //point 믈래스 타입의 멤버변수 선언
	int radius;
	
	Circle(int x, int y, int radius){
		//Point클래스 객체 선언으로 Point point=new Point(x,y)과 같음
		point = new Point(x, y); 
		this.radius=radius;
	}
	
	public String toString(){
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다"; 
	}

	//클래스의 객체 복사 허용
	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

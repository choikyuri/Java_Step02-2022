package chapter14;

public class ExtendsEx1 {
	// 현재 클래스의 특정 메서드가 어떤때는 String을 인자로 받고,
		// 어떤때는 int형을 인자로 받는등, 상황에 따라 다른 인자값을 
		// 받아야 한다면....
		// 멤버변수를 어떻게 선언해야 할까?
		// 오버로딩 하는 방법도 있지만 이런 방법도 있다규요

		Object value; //자바 객체의 최상위인 Object형으로 변수생성

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}
	}
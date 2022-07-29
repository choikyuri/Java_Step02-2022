package pk12;

public class InterTestEx implements InterTest {
		//인터페이스를 구현하려면
		//구현하려는 클래스에서 implements예약어를 사용한다.
		
		@Override
		public int getA() {
			return A; //InterTest의 상수 A를 반환
		}
	}
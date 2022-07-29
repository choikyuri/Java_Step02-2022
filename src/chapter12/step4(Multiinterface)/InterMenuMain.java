package chapter12;

public class InterMenuMain implements Inter_Menu3{
	public static void main(String[] args) {

		InterMenuMain im = new InterMenuMain();

		System.out.println("--우리집 메뉴판--");

		Inter_Menu1 im1 = im;
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		//InterMain의 객체인 im을 Inter_Menu에 대입
		//오류가 날 것 같지만 그렇지가 않다.
		//im이 구현하고 있는 Inter_Menu3이라는 인터페이스가
		//Inter_Menu1과 Inter_Menu2에게서 상속받은 것이므로.

		//하지만 사용 범위가 변환된 각 인터페이스 내에 정의된 메서드들로 
		//국한됨을 기억하자.

		System.out.println(im.jajang());

		//im1객체에서는 jjambbong()과 jajang()만 호출할 수 있다.
		System.out.println(im1.jjambbong());

		//im2객체에서는 tangsuyuck()만 호출할 수 있다.
		System.out.println(im2.tangsuyuck());

		//im3객체에서는  boggembab(), jjambbong(), 
		//	jajang(), tangsuyuck()전부 호출 가능
		System.out.println(im3.boggembab());
	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "하나죽으면 아는 자장면";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "왜 짬뽕은 잠봉이 아님??";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "쌀탕수육";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "다섞어 볶음밥";
	}
}

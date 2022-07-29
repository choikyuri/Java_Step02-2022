package chapter19;

interface PrintString{
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
        //함수를 변수처럼 사용
		PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);  //메서드 매개변수로 전달
		
		PrintString reStr = returnString();  
		reStr.showString("hello ");
		
	}
	//Main이 static이므로 static method
	public static void showMyString(PrintString p ){
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {  //반환 값으로 사용
		return s->System.out.println(s + "world");
	}
}

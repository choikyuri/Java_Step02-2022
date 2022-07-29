package chapter19;

@FunctionalInterface //컴파일에러를 막기위해서 메서드 하나만 구현
public interface MyNumber {
	
	int getMax(int num1, int num2);
	
	//하나의 메서드만 정의 되어 있어야 함
	//int testNumber(int n1, int n2);
}

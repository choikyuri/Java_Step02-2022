package chapter14;

public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i=new Integer(100); //(deprecated 사용을 권장하지않음)
		
		Integer num=100;//오토박싱 일반자료=>클래스 
		
		int iNum=num.intValue(); //언박싱 Integer 클래스 -> int 일반자료형으로 변환
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//언박싱(Integer -> int)
		int total=num+jNum;//num.intValue() +jNum와 같음
		System.out.println(total);
		//오토박싱(int -> Integer)
		Integer i=jNum;
		System.out.println(i);//Integer.valueOf(jNum)로 변환해준것과 같음

	}

}

package iostream;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		//Exception ==>F1
		
		int[] arr = new int[5];
		//오류발생
		/*
		for(int i = 0; i<=5; i++){
			System.out.println(arr[i]); */
		//#1
		/*
		try{
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
		}
		System.out.println("프로그램 종료");
		}*/
		
	//#2
		/*
	//try{
		for(int i = 0; i<=5; i++){
			arr[i] = i;
			System.out.println(arr[i]); //죽었으므로 아래구문 컴파일 불가능
		}
	//}catch(ArrayIndexOutOfBoundsException e){
		//	System.out.println(e);
	//}
	System.out.println("프로그램 종료");
	}*/
	   
		//#3
		
		try{
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}finally { //에러가 나던 안나던 무조건 수행됨
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}
}

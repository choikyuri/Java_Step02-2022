package chapter14;

public class ExitMain {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i);
				//break;
			}
		}
		System.out.println("종료 코드");
	}

}

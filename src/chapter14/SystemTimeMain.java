package chapter14;

public class SystemTimeMain {

	public static void main(String[] args) {


		long starttime=System.nanoTime();
		
		int sum=0;
		for(int i=1;i<=1000000;i++) {
			sum +=i;
		}
		
		long endtime=System.nanoTime();
		
		System.out.println("1 ~ 1000000까지의 합 : "+sum);
		System.out.println("계산에 "+(endtime-starttime)+" 나노초가 소요되었습니다.");

	}

}

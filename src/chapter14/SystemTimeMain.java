package chapter14;

public class SystemTimeMain {

	public static void main(String[] args) {


		long starttime=System.nanoTime();
		
		int sum=0;
		for(int i=1;i<=1000000;i++) {
			sum +=i;
		}
		
		long endtime=System.nanoTime();
		
		System.out.println("1 ~ 1000000������ �� : "+sum);
		System.out.println("��꿡 "+(endtime-starttime)+" �����ʰ� �ҿ�Ǿ����ϴ�.");

	}

}

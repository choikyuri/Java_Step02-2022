package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("-----곰-----");
		Bear b=new Bear();
		System.out.println("눈 : "+b.getEye());
		System.out.println("다리 : "+b.getLeg());
		System.out.println("특이사항 : "+b.woong);
		
		System.out.println("-----사자-----");
		Lion l=new Lion();
		System.out.println("눈 : "+l.getEye());
		System.out.println("다리 : "+l.getLeg());
		System.out.println("특이사항 : "+l.galgi);
		
		System.out.println("-----거미-----");
		Spider s=new Spider();
		System.out.println("눈 : "+s.getEye());
		System.out.println("다리 : "+s.getLeg());
		System.out.println("특이사항 : "+s.web);

	}

}

package chapter16;

public class ThreeDPrinterTest {


	public static void main(String[] args) {

		ThreeDPrinter printerPowder = new ThreeDPrinter();
		Powder p1 = new Powder();
		printerPowder.setMaterial(p1);
		//다운 캐스팅 : Powder가 Object 타입의 매개변수를 갖고 있는 메소드 참조시 다운
		Powder p2 = (Powder)printerPowder.getMaterial();
		System.out.println(p2);
		
		ThreeDPrinter printerPlastic = new ThreeDPrinter();
		Plastic p3 = new Plastic();
		printerPlastic.setMaterial(p3);
		//다운 캐스팅 : Plastic가 Object 타입의 매개변수를 갖고 있는 메소드 참조시 다운
		Plastic p4 = (Plastic)printerPlastic.getMaterial();
		System.out.println(p4);
					
	}
}

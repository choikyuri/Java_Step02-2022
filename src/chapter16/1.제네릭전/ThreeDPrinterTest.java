package chapter16;

public class ThreeDPrinterTest {


	public static void main(String[] args) {

		ThreeDPrinter printerPowder = new ThreeDPrinter();
		Powder p1 = new Powder();
		printerPowder.setMaterial(p1);
		//�ٿ� ĳ���� : Powder�� Object Ÿ���� �Ű������� ���� �ִ� �޼ҵ� ������ �ٿ�
		Powder p2 = (Powder)printerPowder.getMaterial();
		System.out.println(p2);
		
		ThreeDPrinter printerPlastic = new ThreeDPrinter();
		Plastic p3 = new Plastic();
		printerPlastic.setMaterial(p3);
		//�ٿ� ĳ���� : Plastic�� Object Ÿ���� �Ű������� ���� �ִ� �޼ҵ� ������ �ٿ�
		Plastic p4 = (Plastic)printerPlastic.getMaterial();
		System.out.println(p4);
					
	}
}

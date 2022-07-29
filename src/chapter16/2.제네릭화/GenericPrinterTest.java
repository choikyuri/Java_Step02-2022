package chapter16;

public class GenericPrinterTest {

	public static void main(String[] args) {
        /*T타입의 객체는  Object 타입이므로 모든 클래스에서 상속이 
가능하여 자동으로 클래스로 형변환이 가능함*/
GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
powderPrinter.setMaterial(new Powder());
Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
System.out.println(powder);

GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
plasticPrinter.setMaterial(new Plastic());
Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
System.out.println(plastic);




}
}
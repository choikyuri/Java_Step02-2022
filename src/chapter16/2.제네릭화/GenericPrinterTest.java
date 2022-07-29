package chapter16;

public class GenericPrinterTest {

	public static void main(String[] args) {
        /*TŸ���� ��ü��  Object Ÿ���̹Ƿ� ��� Ŭ�������� ����� 
�����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������*/
GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
powderPrinter.setMaterial(new Powder());
Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
System.out.println(powder);

GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
plasticPrinter.setMaterial(new Plastic());
Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
System.out.println(plastic);




}
}
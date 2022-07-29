package chapter16;

public class GenericPrinterTest {

	public static void main(String[] args) {
        /*TŸ���� ��ü��  Object Ÿ���̹Ƿ� ��� Ŭ�������� ����� 
�����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������*/
GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
powderPrinter.setMaterial(new Powder());
Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
System.out.println(powder);

powderPrinter.printing();
System.out.println("-----------------");


GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
plasticPrinter.setMaterial(new Plastic());
Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
System.out.println(plastic);

plasticPrinter.printing();

/*
//���� ���� ���Ǽ��� �ȵ����� ���׸��� Ư���� ����ϴ� ����߻�
GenericPrinter<Water> Waterprinter = new GenericPrinter<Water>();
Waterprinter.setMaterial(new Water());
System.out.println(Waterprinter);*/

}
}
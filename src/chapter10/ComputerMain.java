package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		
		int r=10;
		Computer computer = new Computer();
		System.out.println("���� ���� : "+computer.areaCircle(r));
		
		Calculator calc=new Calculator();
		System.out.println("���� ���� : "+calc.areaCircle(r));
		
	}

}

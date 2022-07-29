package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		
		int r=10;
		Computer computer = new Computer();
		System.out.println("원의 면적 : "+computer.areaCircle(r));
		
		Calculator calc=new Calculator();
		System.out.println("원의 면적 : "+calc.areaCircle(r));
		
	}

}

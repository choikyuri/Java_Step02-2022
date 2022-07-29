package chapter14;

public class EqualsMain {

	public static void main(String[] args) {

		Student studentLee=new Student(100, "�̻��");
		Student studentLee2=studentLee;
		Student studentKim=new Student(100, "�̻��");
		
		System.out.println("==������ �ּ��� �� �ν��Ͻ� ��==");
		if(studentLee==studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�");
		else 
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�");

		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�");
		else 
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�");
		System.out.println();
		
		//�ּҴ� �ٸ����� equals�� ����� ����
		if(studentLee==studentKim)
			System.out.println("studentLee�� studentKim�� �ּҴ� �����ϴ�");
		else 
			System.out.println("studentLee�� studentKim�� �ּҴ� �ٸ��ϴ�");
		
		if(studentLee.equals(studentKim))
			System.out.println("studentLee�� studentKim�� �����մϴ�");
		else 
			System.out.println("studentLee�� studentKim�� �������� �ʽ��ϴ�");
		System.out.println();
		
		System.out.println("*********������ �� ���**********");
		System.out.println("*****StudentŬ������ ����hashcode�� ���*****");
		System.out.println("studentLee�� �����ּ� : "+System.identityHashCode(studentLee));
		System.out.println("studentKim�� �����ּ� : "+System.identityHashCode(studentKim));
		System.out.println("*****StudentŬ������ ������ ���*****");
		System.out.println("studentLee�� hashCode : "+studentLee.hashCode());
		System.out.println("studentKim�� hashCode : "+studentKim.hashCode());
		
		//hashcode�� ������ ��
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println("*****StringŬ������ ������ ���*****");
		System.out.println("str1�� hashCode : "+str1.hashCode());
		System.out.println("str2�� hashCode : "+str2.hashCode());
		
		System.out.println("*****�����*****");
		System.out.println(studentLee.toString());
		System.out.println(studentKim.toString());
		
		
	}

}

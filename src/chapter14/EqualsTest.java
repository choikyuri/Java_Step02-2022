package chapter14;

public class EqualsTest {

public static void main(String[] args) {
	
	String str1=new String("test");
	String str2=new String("test"); // HashCode�� ������ �Ǿ�����
	
	Student studentLee = new Student(100, "�̻��");
	Student studentLee2 = studentLee;
	Student studentSang = new Student(100, "�̻��");
	// ������ �ּ��� �� �ν��Ͻ� ��
	System.out.println("****������ �ּ��� �� �ν��Ͻ� ��****");
	if(studentLee == studentLee2)
		System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
	else
		System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
	if(studentLee.equals(studentLee2))
		System.out.println("studentLee�� studentLee2�� �����մϴ�.");
	else
		System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
	System.out.println();
	
	//�ּҴ� �ٸ����� equals �� ����� true �� ���
	System.out.println("****�ּҴ� �ٸ����� equals �� ����� true �� ���****");
	if(studentLee == studentSang)
		System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
	else
		System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
	if(studentLee.equals(studentSang))
		System.out.println("studentLee�� studentSang�� �����մϴ�.");
	else
		System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
	System.out.println();
	
	System.out.println("*********������ �� ���*********");
	System.out.println("studentLee�� hashCode :" +studentLee.hashCode());
	System.out.println("studentSang�� hashCode :" +studentSang.hashCode());
	System.out.println();
	
	//������ ���� ������ hash���� �ٸ��Ƿ� �����ǰ� �ʿ�
	System.out.println("****StudentŬ������  ������ ���****");
	System.out.println("studentLee�� ���� �ּҰ� :"+ System.identityHashCode(studentLee));
	System.out.println("studentSang�� ���� �ּҰ� :"+ System.identityHashCode(studentSang));
	System.out.println();
	
	//HashCode�� ������ �Ǿ�����
	System.out.println("****StringŬ������  ������ ���****");
	System.out.println("studentLee�� hashCode :" +str1.hashCode());
	System.out.println("studentSang�� hashCode :" +str2.hashCode());
	}
}


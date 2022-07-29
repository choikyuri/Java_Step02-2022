package chapter14;

public class Student {
	
	int studentId;
	String studentName;
	
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	

	@Override
	public String toString() {
		
		return studentId+", "+studentName;
	}

    //����
	//DB�� studentid�� ��ġ�ϴ��� ��
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//�θ�Ŭ������ �ڽ�Ŭ������ �ٿ�ĳ����
			Student std=(Student)obj;
			if(studentId == std.studentId) //��
				return true;//����
			else return false;//����
		}
		return false;//����
	}
	
    //������
	//id�� ��ȯ�ϴ� �޼���� �������Ͽ� �������� �ּҵ� ���� ����
	@Override
	public int hashCode() {
		return studentId;
	}
	

}

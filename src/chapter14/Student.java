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

    //논리적
	//DB와 studentid가 일치하는지 비교
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//부모클래스가 자식클래스로 다운캐스팅
			Student std=(Student)obj;
			if(studentId == std.studentId) //비교
				return true;//성공
			else return false;//실패
		}
		return false;//실패
	}
	
    //물리적
	//id를 반환하는 메서드로 재정의하여 물리적인 주소도 같게 만듬
	@Override
	public int hashCode() {
		return studentId;
	}
	

}

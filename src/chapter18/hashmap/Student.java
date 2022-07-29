package map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	/* 주석처리하면 hashCode가 각각 다른 주소로 할당하므로 Entry수는 2개이다
	//학번과 이름이 같으면 true로 return
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name)) ;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return sno + name.hashCode();
	}*/
}


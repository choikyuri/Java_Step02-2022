package lambDa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Person implements Serializable{

	private static final long serialVersionUID = 8148241969292563332L;
	
	String name;
	//transient : 직렬화 하지 않겠다
	//transient String job;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personAhn = new Person("홍길동", "대표이사");
		Person personKim = new Person("장미란", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 
 사용할 수 있도록 바이트(byte) 형태로 데이터 변환하는 기술과 바이트로 변환된 데이터를 
 다시 객체로 변환하는 기술(역직렬화)을 아울러서 이야기합니다.
시스템적으로 이야기하자면 JVM(Java Virtual Machine 이하 JVM)의 
메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술과 
직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 같이 이야기합니다.
 */



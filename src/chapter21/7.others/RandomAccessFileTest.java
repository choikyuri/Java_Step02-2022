package lambDa;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14); //8
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); //한글자당 3바이트 3*5+2(null) =17
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
	
		rf.seek(0);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("---------------");
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}

/*
 입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스 
 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
 다양한 자료형에 대한 메서드가 제공됨
 */

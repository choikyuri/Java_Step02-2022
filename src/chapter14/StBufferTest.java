package chapter14;

public class StBufferTest {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer("Nice Day");
		
		//StringBuffer 문자열 처리
		System.out.println(buf.toString());
		//StringBuffer 크기
		System.out.println(buf.length()); //8
		//StringBuffer 용량(기본 16에다가 문자열길이 더함)
		System.out.println(buf.capacity());//24
		buf.ensureCapacity(51);//30
		//용량이 넘어가면 (갖고있는용량*2+2)로 확장되지만 확장용량보다 넘어가면 요청한 용량으로 확정됨 
		System.out.println(buf.capacity());
		//새로운 문자 추가
		buf.insert(0, "Hi! ");
		buf.insert(12, " Everubody!");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
		
		

	}

}

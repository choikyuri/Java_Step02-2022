package inputstream;
import java.io.FileInputStream;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		 		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			//버퍼의 크기
			byte[] bs = new byte[10];
			int i;
			while ( (i = fis.read(bs)) != -1){
				
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음" );
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("end");

	}
}
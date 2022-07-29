package lambDa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			//System.in은 바이트 단위로만 지원되므로 문자로 변환시 사용
			//(InputStreamReader isr = new InputStreamReader(System.in))
			int i;
			while( (i = isr.read()) != -1){ 
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Socket의 예
		Socket socket=new Socket();
		try {
			//바이트 단위->문자
			InputStreamReader ir=new InputStreamReader(socket.getInputStream());
			//한줄씩 읽어들이기
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

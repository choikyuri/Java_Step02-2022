package chapter23;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient01 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s=new Socket("172.16.10.30", 3000);

	}

}

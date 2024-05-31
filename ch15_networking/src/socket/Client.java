package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("연결중");
//			socket.connect(new InetSocketAddress("192.168.110.61", 5001));
			socket.connect(new InetSocketAddress("192.168.110.87", 5001));
			System.out.println("연결성공");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "hello, Server";
			out.write(str.getBytes());

			byte[] msg = new byte[100]; // 전송 메시지 받기 위한 변수
			in.read(msg);
			System.out.println(new String(msg));


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



//192.168.110.87
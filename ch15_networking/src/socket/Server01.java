package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("192.168.110.87", 5001));
			while (true) {
				System.out.println("연결 기다리는중");
				Socket socket = server.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

				System.out.println("연결 성공");
				System.out.println(isa.getHostName());

				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				byte[] msg = new byte[100]; // 전송 메시지 받기 위한 변수
				in.read(msg);
				System.out.println(new String(msg));
				String str = "hello, Client : " + isa.getHostName();
				out.write(str.getBytes());

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!server.isClosed()) {
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("소켓닫음");

	}
}

// 긴글쓰기 하나 300타 치기 

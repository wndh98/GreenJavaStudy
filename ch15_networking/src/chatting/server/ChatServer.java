package chatting.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("192.168.110.87", 9002));
			System.out.println("연결 대기 중....");
			while(true) {
				socket = server.accept();
				System.out.println(socket.getRemoteSocketAddress());
				Thread thread = new ClientThread(socket);
				thread.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

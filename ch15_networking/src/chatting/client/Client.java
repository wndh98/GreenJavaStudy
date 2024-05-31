package chatting.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("이름 필요함");
			return;
		}
		try {
			
			Socket socket = new Socket("192.168.110.61", 9002);
//			Socket socket = new Socket("192.168.110.87", 9002);
			Thread thread1 = new ReceiverThread(socket);
			Thread thread2 = new SenderThread(socket, args[0], thread1);
			thread1.start();
			thread2.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}






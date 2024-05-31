package chatting.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {

	Socket socket;
	String name;
	Thread thread;

	public SenderThread(Socket socket, String name, Thread thread) {
		this.socket = socket;
		this.name = name;
		this.thread = thread;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer;
			writer = new PrintWriter(socket.getOutputStream());
			// 출력 스트림으로 별명 전송
			writer.println(name);
			writer.flush();
			while (true) {
				String str = reader.readLine();
				// 내용이 bye면 종료 -> finally로 가서 소켓 닫음
				if (str.equals("bye")) {
					break;
				}
				// 출력 스트림으로 서버로 전송
				writer.println(str);
				writer.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

// 

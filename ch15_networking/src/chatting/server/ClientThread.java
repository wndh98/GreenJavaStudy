package chatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientThread extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<>());
	
	Socket socket;
	PrintWriter writer;
	
	public ClientThread(Socket socket) {
		this.socket=socket;
		try {
			this.writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll(">>" + name + "님이 접속하셨습니다.");
			while(true) {
				String msg = reader.readLine();
				if(msg==null) {
					break;
				}
				sendAll(msg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			list.remove(writer);
			sendAll(name + "님이 나가셨습니다.");
		}
	
	}

	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
		
	}
}

// 


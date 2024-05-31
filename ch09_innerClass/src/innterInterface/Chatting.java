package innterInterface;

import java.util.Scanner;

public class Chatting {

	void startChat(String chatID) {
		String nick = chatID;
		System.out.println(nick + "님이 입장했습니다.");
		
		Chat chat = new Chat() {
			Scanner sc = new Scanner(System.in);
			@Override
			public void start() {
				while(true) {
					System.out.println("msg 입력 : ");
					String input = sc.nextLine();
					String msg = "[" + nick + "] : " + input;
					sendMessage(msg);
				}
				
			}
		};
		
		chat.start();
		
	}

	interface Chat {
		void start();

		default void sendMessage(String msg) {
			System.out.println(msg);
		}
	}
}

// 

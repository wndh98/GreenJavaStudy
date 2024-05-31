package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {

	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<>();
		mq.offer(new Message("sendMail", "tom"));
		mq.offer(new Message("sendSMS", "sam"));
		mq.offer(new Message("sendVoiceTalk", "gom"));
		while (!mq.isEmpty()) {
			Message msg = mq.poll();
			switch (msg.command) {
			case "sendMail":
				System.out.println(msg.to + "에게 메일 발송");
				break;
			case "sendSMS":
				System.out.println(msg.to + "에게 SMS 발송");
				break;
			case "sendVoiceTalk":
				System.out.println(msg.to + "에게 VoiceTalk 발송");
				break;
			}
		}
	}

}

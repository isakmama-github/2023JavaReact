package exam13;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> messageQ = new LinkedList<Message>();
		
		messageQ.offer(new Message("sendMail","홍길동"));
		messageQ.offer(new Message("sendSMS","김자바"));
		messageQ.offer(new Message("sendKakaotalk","박자바"));
		
		while(!messageQ.isEmpty()) {
			Message message = messageQ.poll();
			switch(message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + "님에게 카카오톡 메시지를 보냅니다.");
				break;
				
			}
		}

	}

}

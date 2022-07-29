package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		//ArrayList는 검색이 많은 경우에 사용하고 LinkedList는 잦은 삽입/삭제 시 사용합니다.
		/*LinkedList : ArrayList는 한 덩어리의 큰 배열을 사용하는 방식  
		LinkedList는 양방향 연결 리스트(Doubly Linked List)로 구현
		각각의 데이터가 노드(Node)로 구성되어 연결이 되는 구조이고
		각각의 노드는 데이터와 함께 next(다음 노드)와 prev(이전 노드) 값을 내부적으로 가지고 있음*/
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "이호진"));
		messageQueue.offer(new Message("sendSNS", "김지영"));
		messageQueue.offer(new Message("sendKakaotalk", "홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to +"님에게 메일을 보냈습니다");
				break;

			case "sendSNS":
				System.out.println(message.to +"님에게 sns메세지를 보냈습니다");
				break;

			case "sendKakaotalk":
				System.out.println(message.to +"님에게 카카오톡을 보냈습니다");
				break;
			}
		}	
	}
}


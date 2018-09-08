package queue;

public class Solution {

	public static void main(String[] args) {
		QueueClass queue = new QueueClass();
		queue.insert(12);
		queue.insert(13);
		queue.insert(14);
		queue.display();
		try {
			// queue.peep(index);
			queue.peep(2);
			queue.peep(1);
			queue.peep(5);
		} catch (Exception e) {
			System.out.println("index not available");
		}
	}

}

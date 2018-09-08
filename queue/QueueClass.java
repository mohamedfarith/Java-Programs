package queue;

public class QueueClass {
	Node head;

	// inserting data to the queue
	void insert(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {

			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
	}

	// display the contents of the queue
	void display() {

		Node display = head;
		while (display.next != null) {
			System.out.println(display.data);
			display = display.next;
		}
		System.out.println(display.data);
	}

	// shows the top element in the queue
	void peep(int position) {
		Node s = head;
		// Traversing to the position before element
		for (int i = 0; i < position - 1; i++) {
			s = s.next;
		}
		Node b = s.next;
		System.out.println(b.data + " position " + position);
	}
}

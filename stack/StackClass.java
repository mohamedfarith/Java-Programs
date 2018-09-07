package stack;

public class StackClass {
	Node head;

	void push(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	void isEmpty() {
		if (head == null) {
			System.out.println("empty");
		}else
		System.out.println("not empty");
	}

	void pop() {
		Node remove = head.next;
		head = remove;

	}

	void peep() {
		System.out.println(head.data);
	}

	void display() {
		Node display = head;
		while (display.next != null) {
			System.out.println(head.data);
			display = display.next;
		}
		System.out.println(display.data);

	}

}

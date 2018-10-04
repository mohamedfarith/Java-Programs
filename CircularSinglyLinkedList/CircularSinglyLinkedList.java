package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
	Node head;
	Node tail;
	int size = -1;

	void insertFront(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		// if the list is empty with no elements
		if (tail == null) {
			tail = node;
			node.next = head;
			head = node;
			size++;

		} else {

			node.next = head;
			head = node;
			tail.next = node;
			size++;
		}
	}

	void insertAtLast(int data) {
		Node node = new Node();
		node.data = data;
		// if the list is empty with no elements
		if (tail == null) {
			head = node;
			tail = node;
			size++;
		} else {

			tail.next = node;
			node.next = head;
			tail = node;
			size++;
		}
	}

	void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			insertFront(data);
			size++;
		} 
		else{

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			size++;
		}
	}

	void remove(int index) {
		Node temp;
		Node n = head;
		if (index == 0) {
			temp = head;
			head = temp.next;

		} else if (index == size) {
			Node finalNode = head;
			while (finalNode.next != tail) {
				finalNode = finalNode.next;
			}
			finalNode.next = head;
			tail = finalNode;

		} else {
			for (int i = 0; i < index - 1; i++) {

				n = n.next;
			}

			temp = n;
			n = n.next;
			temp.next = n.next;
		}
	}

	// Node n = new Node();
	// n= head;
	// Node temp = new Node();
	// if(data==tail.data) {
	// while(n.next!=tail) {
	// n=n.next;
	// }n=n.next;
	// tail = n;
	// tail.next = head;
	// }
	//
	// for (int i = 0; i < index; i++) {
	// n = n.next;
	// }
	// temp = n.next;
	// n.next = temp.next;
	//

	void display() {
		Node n = head;
		while (n != tail) {
			System.out.println(n.data + " ");
			n = n.next;
		}
		System.out.println(n.data);
		// System.out.println(tail.data);
	}
}

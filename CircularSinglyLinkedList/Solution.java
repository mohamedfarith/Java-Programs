package CircularSinglyLinkedList;

public class Solution {

	public static void main(String[] args) {
		
CircularSinglyLinkedList listOne = new CircularSinglyLinkedList();
listOne.insertAtLast(0);
listOne.insertAtLast(1);
listOne.insertAtLast(2);
listOne.insertAtLast(3);
listOne.insertAtLast(4);
listOne.insertAtLast(5);
listOne.insertAt(5, 15);

listOne.display();

	}

}

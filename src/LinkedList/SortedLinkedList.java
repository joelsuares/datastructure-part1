package LinkedList;

public class SortedLinkedList {

	private Node head;
	

	public void add(int data) {
		if (this.head == null) {
			this.head = new Node(data);
		} else if (this.head.data > data) {
			Node temp = new Node(data);
			temp.next = this.head;
			this.head = temp;
		} else {
			Node temp = this.head;
			while (temp.next != null && temp.next.data < data) {
				temp = temp.next;
			}

			if (temp.next == null) {
				temp.next = new Node(data);
			} else {
				Node ptr = new Node(data);
				ptr.next = temp.next;
				temp.next = ptr;
			}
		}
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}

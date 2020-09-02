package LinkedList;

public class MyLinkedList {

	private Node head;

	public void add(Object data) {
		if (this.head == null) {
			this.head = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = this.head;
			this.head = temp;
		}
	}

	public Object getElement(int index) {
		Node temp = this.head;
		if (temp == null) {
			return null;
		} else {
			int count = 1;
			while (temp != null) {
				if (count == index) {

					return temp.data;
				}
				temp=temp.next;
				count++;
			}
			return null;
		}
	}

}

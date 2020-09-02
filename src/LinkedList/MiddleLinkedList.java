package LinkedList;

public class MiddleLinkedList {

	private Node head;

	public MiddleLinkedList(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}

	public void middleelement(Node head) {

		if (head == null) {
			return;
		}
		Node t1 = head;
		Node t2 = head;

		while (t1 != null && t1.next != null) {

			t1 = t1.next.next;
			t2 = t2.next;

		}
		System.out.println(t2.data);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1 = new Node(53);
		Node n2 = new Node(73);
		n1.next = n2;
		Node n3 = new Node(48);
		n2.next = n3;
		Node n4 = new Node(67);
		n3.next = n4;
		Node n5 = new Node(95);
		n4.next = n5;

		MiddleLinkedList obj = new MiddleLinkedList(n1);
		obj.middleelement(n1);

	}

}

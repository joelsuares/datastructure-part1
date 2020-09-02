package LinkedList;

public class DeleteParticularNode {

	private Node head;

	public DeleteParticularNode(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}

	public Node delete(Node head, Object key) {
		if (head == null) {
			return null;
		} else if (head.data == key) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			return head;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.data != key) {
				temp = temp.next;
			}

			Node ptr = temp.next;
			if (ptr != null) {
				temp.next = ptr.next;
				ptr.next = null;
			}
			return head;
		}
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Node n1 = new Node(6);
		// n1.next = new Node(34);
		// n1.next.next = new Node(54);
		// n1.next.next.next = new Node(89);
		Node n1 = new Node(6);

		Node n2 = new Node(36);
		n1.next = n2;
		Node n3 = new Node(54);
		n2.next = n3;
		Node n4 = new Node(78);
		n3.next = n4;

		DeleteParticularNode obj = new DeleteParticularNode(n1);
		obj.print();

		System.out.println();
		obj.delete(n1, 36);
		obj.print();

	}

}

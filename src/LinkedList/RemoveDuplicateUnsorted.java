package LinkedList;

public class RemoveDuplicateUnsorted {
	private Node head;

	public RemoveDuplicateUnsorted(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;

	}

	public void duplicate(Node head) {
		Node t1 = head;

		if (head == null) {
			return;
		}

		while (t1 != null && t1.next != null) {
			
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

		Node n1 = new Node(10);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(7);
		n2.next = n3;
		Node n4 = new Node(2);
		n3.next = n4;
		Node n5 = new Node(4);
		n4.next = n5;
		Node n6 = new Node(10);
		n5.next = n6;
		Node n7 = new Node(5);
		n6.next = n7;
		Node n8 = new Node(7);
		n7.next = n8;
		Node n9 = new Node(2);
		n8.next = n9;
		Node n10 = new Node(8);
		n9.next = n10;

		RemoveDuplicateSort obj = new RemoveDuplicateSort(n1);
		obj.dupicate(n1);
		obj.print();
	}

}

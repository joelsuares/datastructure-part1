package LinkedList;

public class CountNumberNodes {
	private Node head;

	public CountNumberNodes(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}

	public void print() {
		Node temp = this.head;
		int count = 0;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			count++;
		}
		System.out.println();
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1 = new Node(36);
		Node n2 = new Node(56);
		n1.next = n2;
		Node n3 = new Node(67);
		n2.next = n3;
		Node n4 = new Node(73);
		n3.next = n4;
		Node n5 = new Node(23);
		n4.next = n5;

		CountNumberNodes obj = new CountNumberNodes(n1);
		obj.print();

	}

}

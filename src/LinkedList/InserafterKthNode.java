package LinkedList;

public class InserafterKthNode {

	private Node head;

	public InserafterKthNode(Node head) {
		// TODO Auto-generated constructor stub

		this.head = head;
	}

	public Node inserafterNode(int k, Node head, int data) {
		//Node ptr = head;

		if (k <= 0) {
			Node temp = new Node(data);
			temp.next = head;
			return temp;
		} else {
			int count = 1;
			Node temp = head;
			while (temp != null) {
				if (count == k) {
					Node ptr1 = new Node(data);
					ptr1.next = temp.next;
					temp.next = ptr1;
					break;
				}
				count++;
				temp = temp.next;
			}
		}
		return head;
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(6);
		n1.next = new Node(34);
		n1.next.next = new Node(54);
		n1.next.next.next = new Node(89);

		InserafterKthNode obj = new InserafterKthNode(n1);

		obj.print();
		System.out.println();
		n1 = obj.inserafterNode(4, n1, 100);
		obj.print();

	}

}

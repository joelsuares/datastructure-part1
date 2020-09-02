package LinkedList;

public class KthNodeFromEnd1 {

	public KthNodeFromEnd1(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}

	private Node head;

	public void kthNode(Node head, int k,int count) {

		if (head == null && k <= 0 ) {
			return;
		}
		if(k>count){
			return;
		}

		Node temp = head;
		int i = 1;
		while (i < k) {

			temp = temp.next;
			i++;
		}
		//System.out.println(temp.data);

		Node t1 = head;
		while (temp.next!= null) {
			temp = temp.next;
			t1 = t1.next;

		}
		System.out.println(t1.data);
	}
	public int countNode() {
		int count = 0;

		Node temp=this.head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
			
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

		KthNodeFromEnd1 obj = new KthNodeFromEnd1(n1);
		int countNode = obj.countNode();
		System.out.println(countNode);
		obj.kthNode(n1, 0,countNode);
	}

}

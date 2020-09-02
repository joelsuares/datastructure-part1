package LinkedList;

public class KthNodeDataFromEnd {
	
	public KthNodeDataFromEnd(Node head) {
		// TODO Auto-generated constructor stub
		this.head=head;
	}

	private Node head;
	
	public void datafromend(Node head,int k, int count){
		
		if(count<=0 && k<=0){
			return;
		}
		Node temp=head;
		for(int i=1; i<=count-k; i++){
			temp=temp.next;
		}
		System.out.println(temp.data);
		
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

		KthNodeDataFromEnd obj=new KthNodeDataFromEnd(n1);
		int countNode = obj.countNode();
		System.out.println(countNode);
		
		obj.datafromend(n1, 1, countNode);
		
		
	}

}

package LinkedListDesign;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList<String> ll=new MyLinkedList<String>();
		ll.add("Sachin");
		ll.add("Rohit");
		ll.add("Dhoni");
		ll.add("Jadeja");
		ll.add("Rina");
		ll.add("Kholi");
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()){
			String name=itr.next();
			System.out.println(name);
		}
	}

}

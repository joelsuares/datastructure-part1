package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("Java");
		ll.add("python");
		ll.add("c++");

		System.out.println("Linked list" + ll);

		ll.addFirst("Joel");
		ll.addLast("Mohna");
		System.out.println("Linked list" + ll);

		// get
		System.out.println(ll.get(0));
		// set
		ll.set(0, "Kiek");
		System.out.println(ll.get(0));

		// remove first and last

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.remove(2);
		System.out.println(ll);

		// hoe to print the value of iterrator

		// for loop

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// advance for loop
		System.out.println("***************************");
		for (String a : ll) {
			System.out.println(a);
		}

		// USING ITERRATOR

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("*************************");
		// while loop
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}

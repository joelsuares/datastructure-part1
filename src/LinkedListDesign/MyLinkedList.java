package LinkedListDesign;

import java.util.Iterator;

class MyIterator<E> implements Iterator<E>{
	Node<E> current;
	
	 MyIterator(Node<E> current) {
		this.current=current;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.current!=null;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		E e=current.data;
		this.current=this.current.next;
		return e;
	}
	
} 

public class MyLinkedList<E> implements Iterable<E>{
	
	private Node<E> head;
	
	public void add(E data){
		
		if(this.head==null){
			this.head=new Node<E>(data);
		}else{
			Node<E> temp=new Node<E>(data);
			temp.next=this.head;
			this.head=temp;
		}
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this.head);
	}


}

package deque;

public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		
		Node<E> toAdd = new Node(data);
		
		if(head == null) {
			head = toAdd;
			tail = toAdd;
		}		
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	
	public E toRemoveLast() {
		if(head == null) {
			return null;
		}
		
		Node<E> temp = tail;
			tail = tail.next;
			tail.prev = null;
			if(tail == null) {
				head =  null;
			}
			
			return temp.data;	
	}
	
	public static class Node<E>{
		E data;
		Node<E> next; Node<E> prev;	
		
		public Node(E data) {
			this.data = data;
			this.next = null; this.prev = null;
			
		}
	}
	
}

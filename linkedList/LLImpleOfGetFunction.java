package linkedList;

public class LLImpleOfGetFunction {
	
	Node head;
	
	void Add(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
	boolean isEmpty() {
		return head == null;
		
	}
		
	
	public void printGet(int var) {
		System.out.println(var);
		
	}

	public int Get(int index) {
		
		Node temp = head;
		int count = 0;
		while(temp != null) {
			if(count == index) {
				return temp.data;
			}
			count++;
			temp = temp.next;
		}	
		assert(false);
		return 0;
	}
	
	static class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
}

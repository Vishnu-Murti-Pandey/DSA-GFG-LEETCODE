package linkedList;

public class LLSetFtn {
	
	Node head;

	void AddS(int data) {
		
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
	
	
	public int Set(int index, int value) {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			if(count == index) {
				temp.data = value;
				break;
			}
			count++;
			temp = temp.next;
		}
		assert(false);
		return 0;	
	}
	
	void printS() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	static class Node {
		Node next;
		int data;
		int index;
		
		public Node(int data, int index) {
			this.data = data;
			this.index = index;
			next = null;
		}
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

}

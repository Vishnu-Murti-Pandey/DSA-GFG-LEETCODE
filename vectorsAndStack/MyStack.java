package vectorsAndStack;
import linkedList.LLImplementation;

public class MyStack<E> {
	
	private LLImplementation<E> ll = new LLImplementation<>();
	
	
	void push(E e) {
		ll.Add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");
		}
		return ll.getLast();	
	}

}


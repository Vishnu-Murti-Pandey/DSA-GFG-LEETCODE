package queue;
import java.util.*;


public class MainClass {

	public static void main(String[] args) {

		MyQueue<Integer> myq = new MyQueue<>();
		
		myq.enqueue(12);
		myq.enqueue(69);
		myq.enqueue(6);
		myq.enqueue(89);
		myq.enqueue(45);
	
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		
		System.out.println(myq.peek());
		
		
	}

}

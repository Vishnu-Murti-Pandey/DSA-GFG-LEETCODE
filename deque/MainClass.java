package deque;
import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(65);
		ad.addFirst(69);
		
		ad.pop();
		ad.pop();
		System.out.println(ad.peek());
		
	}

}

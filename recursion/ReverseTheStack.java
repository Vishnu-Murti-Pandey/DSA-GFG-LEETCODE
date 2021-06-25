package recursion;
import java.util.*;;

public class ReverseTheStack {

	static Stack<Integer> s = new Stack<>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			s.push(sc.nextInt());
		}
		reverse();
		System.out.println(s.toString());
	}
	
	public static void reverse() {
		if(s.size() > 0) {
			int flag = s.pop();
			reverse();
			insert(flag);
		}
	}
	
	public static void insert(int ele) {
		if(s.size() == 0) {
			s.push(ele);
		}
		else {
			int temp = s.pop();
			insert(ele);
			s.push(temp);
		}
	}
}
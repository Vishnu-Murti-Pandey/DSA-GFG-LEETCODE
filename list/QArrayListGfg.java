package list;
import java.util.*;

public class QArrayListGfg {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int q = sc.nextInt();
	
	List<Integer> input = new ArrayList<>();
	
	for(int i=0; i<n; i++) {
		input.add(sc.nextInt());
	}
	
	
	if(q==1) {
		int p = sc.nextInt();	
		 int r = sc.nextInt();
		 query1(input, p, r);
	}
	
	else if(q==2) {
		int p = sc.nextInt();	
		query2(input, p);
	}
	
}
	
	public static void query1(List<Integer> input, int p, int r) {
		input.add(p,r);
		 
		 for(int e: input) {
			 System.out.print(e+" ");
		 }
		
	}
	
	public static void query2(List<Integer> input, int p) {
		if(input.contains(p)) {
			System.out.println(input.lastIndexOf(p));
		}
		else {
			System.out.println(-1);
		}
		
	}
	
	
}

	


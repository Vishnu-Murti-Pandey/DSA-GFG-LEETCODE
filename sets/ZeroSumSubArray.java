package sets;
import java.util.*;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {0,0,5,5,0};
		boolean found = false;
		int count = 0;
		int k = 0;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int e: a) {
			set.add(sum);
			sum = sum + e;
			if(set.contains(sum-k)) {
				found = true;
				count++;
			}
		}
		System.out.println(found+" "+ count);
	}

}

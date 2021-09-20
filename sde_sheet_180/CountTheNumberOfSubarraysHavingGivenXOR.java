package sde_sheet_180;
import java.util.*;

public class CountTheNumberOfSubarraysHavingGivenXOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		int txor = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		
		for(int i=0; i<n; i++) {
			txor = txor^arr[i];
			if(map.containsKey(txor)) {
				map.put(txor, map.get(txor)+1);
			}
			else {
				map.put(txor, 1);
			}
			if(txor == k) {
				count++;
			}
			if(map.containsKey(txor^k)) {
				count = count + map.get(txor^k);
			}
		}
		
		System.out.println(count);
	}

}

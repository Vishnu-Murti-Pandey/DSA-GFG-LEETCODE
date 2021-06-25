package recursionAdvance;
import java.util.*;

public class CoinGame {

	public static void main(String[] args) {

		int a[] = {1, 5, 8, 3, 6, 7};
		int ans = coinMax(a, 0, a.length-1);
		System.out.println(ans);
	}
	
	static int coinMax(int a[], int l, int r) {
		if(l+1 == r) {
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)),
						a[r] + Math.min(coinMax(a, l+1, r-1), coinMax(a, l, r-2)));
	}

}

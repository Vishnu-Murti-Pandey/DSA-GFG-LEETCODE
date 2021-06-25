package recursion;

public class PowerUsingRecursion {

	static int step = 0;
	
	public static void main(String[] args) {
		
		System.out.println(power(5,4));
		System.out.println(fastPow(9767,7679));
		
	}
	
	static int power(int x, int y) {
		if(y==0) {
			return 1;
		}
		return x*power(x, y-1);
	}
	
	static int fastPow(int a, int b) {
		if(b==0) {
			return 1;
		}
		else if(b%2==0) {
			return fastPow(a*a, b/2);
		}
		
		return a*fastPow(a, b-1);
	}

}

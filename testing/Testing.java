package testing; 
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Testing {
	
	public static void main(String[] args) {
		
		int x, y, z, a;
		
		x = 2;
		y = 1;
		z = 5;
		
		a = (x&y) | (z+1);
		
		System.out.println(a);
		
	}
	
	public static int fun(int n) {
		if(n == 4) {
			return n;
		}
		else {
			return 2 * fun(n+1);
		}
	}
}

package arrays;

import java.util.Scanner;
public class RotateArrayFromGivenIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Size Of Array : ");
		int n = sc.nextInt();
		System.out.print("Enter The Rotation Index :");
		int r = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt(); 
		}
		for(int i=r; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[j] = a[i];
				System.out.println(b[j]+" ");
				break;
			}
		}
		for(int i=0; i<r; i++) {
			System.out.println(a[i]);
		}
		
	}

}

package arrays;
import java.util.Scanner;

public class DuplicatesUnderGivenConstraints {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 10;
		int a[] = new int [10];
		
		for(int i=0; i<10; i++) {
			a[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] == a[j])
					count++;
				if(count == 5) {
					System.out.println(a[i]);
					break;
					}
			}
			
		}
	}

}

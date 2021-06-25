package dynamicProgramming;
import java.util.*;

public class ArrangeBuildings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int cSpace = 1;
		int cBuildings = 1;
	
		for(int i=2; i<n+1; i++) {
			int tempS = cSpace + cBuildings;
			cBuildings = cSpace;
			cSpace = tempS;
		}
		long totalWays = cSpace + cBuildings;
		
		//let n = 3
		// no. of ways one side can have buildings and spaces are = 5 with no two buildings can come consecutive
		// let say its "SSB"
		// then in other side we can put building and spaces in all 5 ways -> "SSB", "BSB", "SBS", "BSS", "SSS"
		// thus we have 5 ways in one side to put buildings and spaces and 5 ways to put in other side also
		// hence total ways will 5*5 
		System.out.println(totalWays*totalWays);
		

	}

}

package loops;

public class TableFrom1to20 {

	public static void main(String[] args) {

		int output;
		int i,j;
		for(i=1;i<=20;i++) {
			
			for(j=1;j<=20;j++) {
				output = i*j;
				System.out.print(output +" ");
					}
			System.out.println();

			}

}

}
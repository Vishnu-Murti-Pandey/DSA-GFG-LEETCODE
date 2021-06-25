package fun;

public class fizzbuzz {

	public static void main(String[] args) {
		
		
		// good solution
//		for(int i=1; i<=100; i++) {
//			String data = "";
//			if(i%3 == 0) {
//				data = data + "fizz";
//			}
//			if(i%5==0) {
//				data = data + "buzz";
//			}
//			if(data == "") {
//				System.out.println(i);
//			}
//			else {
//				System.out.println(data);
//			}
//		}
//		
		//best solution
		int c3 = 0;
		int c5 = 0;
		
		for(int i=1; i<=100; i++) {
			c3++;
			c5++;
			String d = "";
			if(c3 == 3) {
				d = d + "fizz";
				c3 = 0;
			}
			if(c5 == 5) {
				d = d + "buzz";
				c5 = 0;
			}
			if(d == "") {
				System.out.println(i);
			}
			else {
				System.out.println(d);
			}
		}
		

	}

}

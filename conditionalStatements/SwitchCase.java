package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		
		int dayofweek = 4;
		
//		if(dayofweek == 1) {
//			
//		}
//		if(dayofweek == 2) {
//			
//		}
//		if(dayofweek == 3) {
//			
//		}
//		if(dayofweek == 4) {
//			
//		}
//		if(dayofweek == 5) {
//			
//		}
//		if(dayofweek == 6) {
//			
//		}
//		if(dayofweek == 7) {
//	
//		}
//	
		switch(dayofweek) {
		case 1:
			System.out.println("i am on leave");
			break;
		case 2:
			System.out.println("i donot want it");
			break;
		case 3:
			System.out.println("uhhh! again");
			break;
		
		default:
			System.out.println("yes! hoilday");
		}
			
	}

}
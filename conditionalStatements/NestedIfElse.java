package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 45;
		int b = 450;
		int c = 4500;
		int result;
		
		if(a>b) {
			if(a>c) {
				result = a;
			}else {
				result = c;
			}	
		}else {
			if(b>c) {
				result = b;
			}else {
				result = c;
			}
		}
		System.out.println("largest of three numbers is "+result);

	}

}

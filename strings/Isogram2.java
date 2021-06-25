package strings;

public class Isogram2 {

	public static void main(String[] args) {


		String input = "machine";
		
		boolean result = isIsogram(input);
		System.out.println(result);
			
		}
		
		public static boolean isIsogram(String str) {
			
			for(int i=0; i<str.length(); i++) {
				for(int j=1; j<str.length(); j++) {
					if(str.charAt(i) == str.charAt(j)) 
						return false;
							}
					}
			return true;

	}

}

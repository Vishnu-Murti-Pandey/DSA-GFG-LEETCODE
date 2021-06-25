package strings;

public class AmagramOptimised {

	public static void main(String[] args) {				//for more optimisation
		
		String a = "aab";
		String b = "aba";
		boolean isAnagram = true;
		
		int al[] = new int[256];
		int bl[] = new int[256];  				 //comment this
		
		for(char c: a.toCharArray()) {
			int index = (int) c;				//type casted in integer
			al[index]++;						//al[index]--
				}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			bl[index]++;						//bl[index]--
				}	
		for(int i=0; i<256; i++) {
			if(al[i] != bl[i]) {				//if(a[i] != 0)
				isAnagram = false;
				break; }
		}
		
			if(isAnagram) {
				System.out.println("anagram");
					}
			else
				System.out.println("not an anagram");
	}
}

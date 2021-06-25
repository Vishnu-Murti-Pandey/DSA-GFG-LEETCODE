package strings;

public class StringIntro {

	public static void main(String[] args) {
		
		String name = "Vishnu Murti Pandey";
		//String name2 = "Vishnu";
		
		String name3 = new String("Vishnu Murti Pandey");
		//System.out.println(name == name2);													*  //  strings are immutable.
		
					//  some functions in string are : 
		
	//	1. char charAt(int index) -> it will return the character at 0th index.
		 System.out.println(name.charAt(0));
		 
	//	2. int length() -> it will return total characters in string. it also includes spaces.
		 System.out.println(name.length());
		 
	//	3. String substring(int beginIndex) -> it will return a substring from a string.
		 System.out.println(name.substring(2));
		 
	//	4. String substring(int beginIndex, int endIndex) -> it will also return a substring from 0 to n-1.
		 System.out.println(name.substring(2,5));
		 
	//	5. boolean contains(CharSequence s)
		 System.out.println(name.contains("Vishnu"));
		 
	//  6. boolean equals(Object another)
		 System.out.println(name.equals(name3));
		 
	//  7. boolean isEmpty()
		 System.out.println(name.isEmpty());
		 
	//  8. String concat(String str)
		 System.out.println(name.concat(" bbd"));
		 
	//  9. String replace(char old, char new)    // IT ONLY TAKES ONE CHAR TO BE REPALCED
		 System.out.println(name.replace("V", "C"));
		 
	//  10. String[] split(String regex)
		 String cars = "Hyundai,Maruti,Wagonr,Scorpio,Lamborghini";
		 String allCars[] = cars.split(",");
		 for(String car: allCars) {
			 System.out.println(car);
		 }
			 
	//  11. int indexOf(int ch)
		 System.out.println(name.indexOf("V"));
		 
	//  12. String toLowerCase()
		 System.out.println(name.toLowerCase());
		 
	//  13. String toUpperCase()
		 System.out.println(name.toUpperCase());
		 
	//  14. String trim()  too remove unnessesary spaces
		 System.out.println(name.trim());
		 
	//	15. String str = "roman reings";
	//	 char arr[] = str.toCharArray();
	//	 System.out.println(arr);
		 
		 String str = "vishnu";
		 int count = 0;
		 for(int i=0; i<str.length(); i++)
			if(Character.isUpperCase(str.charAt(i)))
				count++;
		 System.out.println(count);
	//		this tells weather the character is upper case of not
		 
		 
		 
	}

}

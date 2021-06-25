package strings;
 
import java.util.*;

public class Isogram {

	public static void main(String[] args) {
		
		        String str1 = "Machine"; 
		        System.out.println(isIsogram(str1)); 
		  
		        String str2 = "isogram"; 
		        System.out.println(isIsogram(str2)); 
		  
		        String str3 = "panday"; 
		        System.out.println(isIsogram(str3)); 
		  
		        String str4 = "Alphabet"; 
		        System.out.println(isIsogram(str4));
	    } 
	  
	 static boolean isIsogram(String str) 
	    { 
	        // Convert the string in lower case letters 
	        str = str.toLowerCase(); 
	        char arr[] = str.toCharArray(); 
	        
	        Arrays.sort(arr);
	        for (int i = 0; i < str.length()- 1 ; i++) { 
	            if (arr[i] == arr[i + 1]) 
	                return false; 
	        } 
	        return true; 
	    } 	
	
	}
	


package typeCasting;

import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList<Integer>(); 
	        al.add(30); 
	        al.add(20); 
	        al.add(10);
	        al.add(10);
	        al.add(40); 
	        al.add(50); 
	        
	        
	        int index = Collections.binarySearch(al, 20); 
	        System.out.println(index); 
	  
	        // 13 is not present. 13 would have been inserted 
	        // at position 4. So the function returns (-4-1)  
	        // which is -5. 
	        //index = Collections.binarySearch(al, 13); 
	        //System.out.println(index); 
		
	}

}
  
package sets;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		x.add(1);;
		x.add(4);
		x.add(16);
		
		Set<Integer> y = new HashSet<>();
		y.add(2);;
				
		System.out.println(x.containsAll(y));
		
		
//		Set<String> fruits = new TreeSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("Apple");		
//		fruits.add("Kiwi");
//		
//		System.out.println(fruits);
		

	}

}

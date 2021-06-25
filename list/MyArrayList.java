package list;
import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
		
		//List<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Hi");
		
		//System.out.println(fruits.size());
		//System.out.println(fruits.contains("Orange"));
		//System.out.println(fruits.isEmpty());
		
		 String temp[] = new String[fruits.size()];
		 fruits.toArray(temp);
		 
		
		 for(String e: temp) {
			 System.out.println(e);
		 }
		 
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
		
//		vegetables.add("potato");
//		vegetables.add("tomato");
//		vegetables.add("ginger");
	
		//fruits.addAll(vegetables);
		
		//fruits.set(1, "grapes");
		//System.out.println(fruits.get(1));
		//fruits.remove(1);
		
		//fruits.clear();
		//fruits.removeAll(toRemove);
		
		//System.out.println(fruits);
		
		
//		ArrayList<Integer> arraylist = new ArrayList();
		
//		Pair<String, Integer> p1 = new Pair("Vishnu", 45);
//		Pair<Boolean, String> p2 = new Pair(true, "Pandey");
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}

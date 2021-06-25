package linkedList;
import java.util.*;

public class MyLList {

	public static void main(String[] args) {


				LLImpleOfGetFunction llist = new LLImpleOfGetFunction();
						
					for(int i=0; i<=10; i++) {
						llist.Add(i);
					}
						
					llist.printGet(llist.Get(5));

	}

}

package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		t.name = "Mr. Harry";
		t.eat();
		
		//t.walk();
		t.teach();
		
		Singer s = new Singer();		
		s.name  = "honey singh";
		s.eat();
		s.sing();
		//s.walk();
		
	}

}

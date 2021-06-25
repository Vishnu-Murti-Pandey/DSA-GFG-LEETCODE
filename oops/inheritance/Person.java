package oops.inheritance;

public class Person {

	protected String name;
	
	public void walk() {
		System.out.println("person " +name +" is walking");
		
	}
	public void eat() {
		//super.eat();
		System.out.println("person " +name +" is eating");
		
	}
	
	public static void laughing() {
		
		System.out.println("person is laughing");
	}

}

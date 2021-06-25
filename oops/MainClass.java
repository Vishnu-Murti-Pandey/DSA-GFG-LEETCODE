package oops;

class Cat{
	boolean hasfur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void laugh() {
		System.out.println("cat is laughing");
	}
	public void discription() {
		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes ");
	}
	
}
class Dog{
	String breed, name;
	
	public void jump() {
		System.out.println("my dog "+name+" jumped ");
	}
	public void discription() {
		System.out.println("my dogs name is "+name+ " and its breed is "+breed);
	}
}
public class MainClass {
	public static void main(String[] args) {
//		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		Cat cat3 = new Cat();
//		Cat cat4 = new Cat();
//		
//		cat4.legs = 4;
//		cat4.eyes = 2;
//		cat2.legs = 6;
//		cat2.eyes = 8;
//		
//		cat1.walk();
//		cat2.eat();
//		cat3.laugh();
//		cat4.discription();
//		cat2.discription();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.name = "bruno";
		dog1.breed = "german shepherd";
		
		dog2.name = "premchand ";
		dog2.breed = "secular";
			
		dog1.jump();
		dog1.discription();
		dog2.jump();
		dog2.discription();
		
	}
	
}

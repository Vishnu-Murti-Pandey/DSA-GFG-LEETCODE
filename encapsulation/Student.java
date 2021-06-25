package encapsulation;

public class Student {

	private	int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("you are to old to be a student");
		}
		else {
			this.age = age;
		}
	}
	
	
}

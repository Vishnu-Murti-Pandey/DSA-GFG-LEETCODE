package oops;

class vehical{
	
	int wheels;
	int headLights;
	String color;
	
	vehical(){
		
	}
	
	vehical(int wheels){				
	this.wheels = wheels;
		headLights = 2;
	}
	
	vehical(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		this.headLights = 2;
	}
}

public class MyConstructor {

	 MyConstructor() {
		System.out.println("now object is created ");
	}
	
	public static void main(String[] args) {
		
		vehical car = new vehical(4);
		vehical scooty = new vehical(2);
		vehical eRikshaw = new vehical(3, "Red");
		
		vehical random = new vehical();
		System.out.println(eRikshaw.wheels +" wheels and color = "+ eRikshaw.color);
	}

}

package oops.abstraction;

public class WagonR extends Car {

	
	public void breaking() {
		System.out.println("Wagon R is breaking");
	}

	@Override
	public void accelerate() {
		System.out.println("WagorR is accelerating");
	}
}

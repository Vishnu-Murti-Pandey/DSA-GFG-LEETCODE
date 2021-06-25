package oops.interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		 Person obj = new Person();
		 obj.study();
		 obj.makeVideo();
		 
		 Youtuber obj2 = obj;
		 obj2.editVideo();
		 obj.makeVideo();

	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making good video");
		
	}

	@Override
	public void study() {
		System.out.println("Person is Studying");
		
	}

	@Override
	public void editVideo() {
		System.out.println("person is good video editor");
		
	}
	
	public void uploadVideo() {
		
	}
	

}

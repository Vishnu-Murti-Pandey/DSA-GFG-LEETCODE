package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber, secondNumber);
		
		maxOf(100,200);
		maxOf(4,2);
		
		System.out.println(result);
		
		sayHi();
		sayHi();
	}
	
	static int maxOf(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
		
	}
	
}

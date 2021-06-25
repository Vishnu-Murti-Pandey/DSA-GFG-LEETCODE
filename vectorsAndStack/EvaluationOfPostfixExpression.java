package vectorsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfixExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
		String str = sc.next();	
		Stack<Integer> stack = new Stack<>();	
		
		for(int i = 0; i < str.length(); ++i) {

			if(Character.isDigit(str.charAt(i))) {
			stack.push(str.charAt(i) - '0');
			}
			else {
			int x = stack.pop();
			int y = stack.pop();

			switch(str.charAt(i))
			{
			case '+' : stack.push(y + x);
			break;

			case '-' : stack.push(y - x);
			break;

			case '*' : stack.push(y * x);
			break;

			case '/' : stack.push(y / x);
			break;
			}
		}
	}
		System.out.println(stack.pop());
		}
	}	
}


package strings;

public class ToCharArray {

	public static void main(String[] args) {
//		
//			String s1="hello";  
//			char[] ch=s1.toCharArray();  
//			for(int i=0;i<ch.length;i++){  
//			System.out.print(ch[i]);  
//			}  
		
 
		        String s1 = "Welcome to Javatpoint";  
		        char[] ch = s1.toCharArray();  
		        int len = ch.length;  
		        System.out.println("Char Array length: " + len);  
		        System.out.println("Char Array elements: ");  
		        for (int i = 0; i < len; i++) {  
		            System.out.print(ch[i]);  
		        }  

	}

}

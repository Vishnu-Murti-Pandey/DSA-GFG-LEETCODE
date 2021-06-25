package recursion;

public class PathsInNMGrid {

	public static void main(String[] args) {

		System.out.println(path(5, 3));
		
	}
	static int path(int m, int n) {
		if(n == 1 || m == 1) {
		return 1;	
		}
		return path(m-1, n) + path(m, n-1);
	}
}

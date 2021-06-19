package backtracking;

public class ShortestPathInAMaze {

	public static void main(String[] args) {
		
		int a[][] = {{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
					{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
					{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
					{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
					{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 }};
		
		int result = shortestpath(a, 1, 1, 1, 4);
		if(result >=  1000000) {
			System.out.println("No Paths Are Available");
		}
		else {
			System.out.println(result);
		}

	}
	static int shortestpath(int a[][], int i, int j, int x, int y) {
		int rows = a.length;
		int cols = a[0].length;
		
		boolean vis[][] = new boolean[rows][cols];
		return shortestpath(a, i, j, x, y, vis);
		
	}
	
	static boolean isValid(int a[][], int i, int j, boolean vis[][]) {
		int rows = a.length;
		int cols = a[0].length;
		
		return i >= 0 && j >= 0 && i < rows && j < cols && a[i][j] == 1 && !vis[i][j];
	}
	
	static int shortestpath(int a[][], int i, int j, int x, int y, boolean vis[][]) {
		
		if(!isValid(a, i, j, vis)) return 1000000;
		if(i == x && j == y) return 0;
		
		vis[i][j] = true;
		int left = shortestpath(a, i, j-1, x, y, vis) + 1;
		int right = shortestpath(a, i, j+1, x, y, vis) + 1;
		int top = shortestpath(a, i-1, j, x, y, vis) + 1;
		int bottom = shortestpath(a, i+1, j, x, y, vis) + 1;
		
		//backtracking works here
		vis[i][j] = false;
		return Math.min(Math.min(right, left), Math.min(top, bottom));
		
	}

}

package bst;

class Node {
	
	int data;
	Node left;
	Node right;
	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class MyBST {

	public static void main(String[] args) {
		
		int arr[] = {12, 25, 37, 50, 75, 87, 88, 98, 100};
		Node root = construct(arr, 0, arr.length-1);
		display(root);

	}
	public static Node construct(int arr[], int lo, int hi) {
		if(lo > hi) {
			return null;
		}
		
		int mid = (lo + hi)/2;
		
		int data = arr[mid];
		Node lc = construct(arr, lo, mid-1);
		Node rc = construct(arr, mid+1, hi);
		
		Node node = new Node(data, lc, rc);
		return node;
		
	}
	public static void display(Node root) {
		if(root==null) {
			return;
		}
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
	}

}


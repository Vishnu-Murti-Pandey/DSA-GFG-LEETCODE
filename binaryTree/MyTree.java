package binaryTree;
import java.util.*;

public class MyTree {

	Node root;
	static class Node {
		
		int data;
		Node left, right;
		
		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
 	}
	
	static class pair {
		int state;
		Node node;
		
		pair(Node node, int state) {
			this.state = state;
			this.node = node;
		}
	}
	
	public static void InOrder(Node node) {
		if(node != null) {
			InOrder(node.left);
			System.out.print(node.data +" ");
			InOrder(node.right);
		}
		
	}
	
	public static void main(String[] args) {
		Integer arr[] = {1, 2, 4, 6, null, null, 6, null, null, 5, 6, null, null, null, 3, 6, null, null, 3, null, null};
		
		Node root = new Node(arr[0], null, null);
		Stack<pair> st = new Stack<>();
		
		pair rtp = new pair(root, 1);
		st.push(rtp);
		
		int idx = 0;
		int leftHeight = 0;
		int rightHeight = 0;
		
		while(st.size() > 0) {
			pair top = st.peek();
			if(top.state == 1) {
				idx++;
				if(arr[idx] != null) {
					top.node.left = new Node(arr[idx], null, null);
					pair lp = new pair(top.node.left, 1);
					st.push(lp);
					leftHeight++;
				}
				else {
					top.node.left = null;
				}
				top.state++;
			}
			
			else if(top.state == 2) {
				idx++;
				if(arr[idx] != null) {
					top.node.right = new Node(arr[idx], null, null);
					pair rp = new pair(top.node.right, 1);
					st.push(rp);
					rightHeight++;
				}
				else {
					top.node.right = null;
				}
				top.state++;
			}
			
			else {
				st.pop();
			}
		}
		InOrder(root);
	}
 }
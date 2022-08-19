package tree;

import java.util.ArrayList;

public class PreorederTraverse {
	
	public ArrayList<Integer> traverse(Node root){
		 ArrayList<Integer> list = new ArrayList<>();
		 preOrder(root, list);
		return list;
	}
	
	public void preOrder(Node node, ArrayList<Integer> list) {
		if(node == null) return;
		list.add(node.data);
		preOrder(node.left, list);
		preOrder(node.right, list);
	}
	
	public static void main(String[] args) {
		
	}
	
	
	class Node{
		int data;
		
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
		
		
	}

}

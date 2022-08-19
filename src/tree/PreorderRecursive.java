package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderRecursive {

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		if(root == null)  return list;
		TreeNode node = root;
		
		while(!stack.isEmpty() || node != null) {
			if(node != null) {
				stack.push(node);
				list.add(node.val);
				node = node.left;
			}else {
				stack.pop();
				node = node.right;
			}
		}
		 
		return list;
	}
	
	public static void main(String[] args) {
		SolutionIterator solution = new SolutionIterator();
    	TreeNode treeNode = new TreeNode(5);
    	treeNode.left = new TreeNode(3);
    	treeNode.right = new TreeNode(6);
    	treeNode.left.left = new TreeNode(2);
    	treeNode.left.right = new TreeNode(4);
    	treeNode.right.left = new TreeNode(5);
    	treeNode.right.left.right = new TreeNode(7);

    	solution.preorderTraversal(treeNode);
	}
}

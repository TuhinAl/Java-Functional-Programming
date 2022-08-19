package tree;
import java.util.ArrayList;
import java.util.List;

class SolutionIterator {
    public  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        System.out.println(list);
        return list;
    }
    public  void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        dfs(node.left, list);
        dfs(node.right, list);
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
//    	TreeNode three = new TreeNode(3);
//    	TreeNode four = new TreeNode(4);
//    	TreeNode five = new TreeNode(5);
//    	TreeNode four2nd = new TreeNode(4);
//    	TreeNode six = new TreeNode(6);
//    	TreeNode eight = new TreeNode(8);
//    	TreeNode seven = new TreeNode(7);
//    	TreeNode eight2nd = new TreeNode(8);
//    	
//    	solution.preorderTraversal(two);
//    	solution.preorderTraversal(three);
//    	solution.preorderTraversal(four);
//    	solution.preorderTraversal(five);
//    	solution.preorderTraversal(four2nd);
//    	solution.preorderTraversal(six);
//    	solution.preorderTraversal(eight);
//    	solution.preorderTraversal(seven);
//    	solution.preorderTraversal(treeNode);
//    	System.out.println(dfs());
    	solution.preorderTraversal(treeNode);
	}
}
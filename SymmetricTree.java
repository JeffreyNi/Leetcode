/*
  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

  For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
*/

public class SymmetricTree {

    public static class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;} 
    }

    public static boolean pairMatch(TreeNode left, TreeNode right) {
	if (left == null && right == null) {return true;}
	if (left == null || right == null) {return false;}
	if (left.val != right.val) {return false;}
	return pairMatch(left.left, right.right) && pairMatch(left.right, right.left);
    }

    public static boolean isSymmetric(TreeNode root) {
	if (root == null) {return true;}
	else return pairMatch(root.left, root.right);
    }

    public static void main(String args[]) {

    }
}
/*
  Maximum Depth of Binary Tree

  Given a binary tree, find its maximum depth.

  The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

public class MaximumDepthOfBinaryTree {
    
    public static class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
    }

    public static int maxDepth(TreeNode root) {
	if (root == null) {return 0;}
	return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
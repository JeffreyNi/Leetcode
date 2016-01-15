/*
  Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

  For example:
  Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

*/

import java.lang.Integer;
import java.util.*;

public class BinaryTreeLevelOrderTraversal{
	    
    public static class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
    }
    
    public static void getList(TreeNode root, List<List<Integer>> result, int depth ) {
	if (root == null) {return;}

	List<Integer> list;
	if (result.size() < depth) {
	    list = new ArrayList<Integer>();	
	    result.add(list);
	} else { list = result.get(depth - 1); }
	list.add(root.val);
	getList(root.left, result, depth + 1);
	getList(root.right, result, depth + 1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	
	getList(root, result, 1);

	return result;
    }

    public static void main(String args[]) {
		
    }
	    
}
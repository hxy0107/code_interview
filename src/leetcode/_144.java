package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Binary Tree Preorder Traversal Total Accepted: 77358 Total Submissions: 212847 My Submissions Question Solution
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class _144 {
    List<Integer> integerList = new ArrayList<Integer>();
    Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return integerList;
        treeNodeStack.push(root);
        while (!treeNodeStack.empty()) {
            TreeNode temp = treeNodeStack.pop();
            integerList.add(temp.val);
            if (temp.right != null) {
                treeNodeStack.push(temp.right);
            }
            if (temp.left != null) {
                treeNodeStack.push(temp.left);
            }
        }
        return integerList;
    }
}











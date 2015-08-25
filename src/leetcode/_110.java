package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Balanced Binary Tree Total Accepted: 67787 Total Submissions: 212329 My Submissions Question Solution
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class _110 {
    public boolean isBalanced(TreeNode root){
       if(root==null)return true;
        if(getHeight(root)==-1)return false;
        return true;

    }
    public int getHeight(TreeNode root){
        if(root==null)return 0;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(left==-1||right==-1)return -1;
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }

}

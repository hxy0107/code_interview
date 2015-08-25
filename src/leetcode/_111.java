package leetcode;

import javax.transaction.TransactionRequiredException;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Minimum Depth of Binary Tree Total Accepted: 66577 Total Submissions: 230051 My Submissions Question Solution
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class _111 {
    public int minDepth(TreeNode root){
        if(root==null)return 0;
        if(root.left==null||root.right==null)
            return 1+Math.max(minDepth(root.left),minDepth(root.right));
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
    public int minDepth1(TreeNode root){
        if(root==null)return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        return (left==0||right==0)?left+right+1:Math.min(left,right)+1;
    }
}

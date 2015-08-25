package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Path Sum Total Accepted: 65596 Total Submissions: 221141 My Submissions Question Solution
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class _112 {
    public boolean hasPathSum(TreeNode root,int sum){
        if(root==null)return false;
        sum=sum-root.val;
        if(root.left==null&&root.right==null){
            if(sum==0)return true;
            else return false;
        }
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
}

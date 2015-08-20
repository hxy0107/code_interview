package cc150.stacks_and_queues;

/**
 * Created by xianyu.hxy on 2015/8/19.
 */
/*
Implement a function to check if a tree is balanced  For the purposes of this question,
a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
from the root by more than one
 */
public class _4_1 {
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public static int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }
    public static boolean isBalanced(TreeNode root){
        return (maxDepth(root)-minDepth(root)<=1);
    }
}

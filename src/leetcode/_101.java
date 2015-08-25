package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
public class _101 {
    public boolean isSymmetric(TreeNode root){
        if(root==null)return true;
        return isSymmetric(root.left,root.right);
    }
    boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null)return true;
        if(left==null||right==null)return false;
        if(left.val!=right.val)return false;
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
    public boolean isSymmetric1(TreeNode root){
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)return true;
        q.add(root.left);
        q.add(root.right);
        while(q.size()>1){
            TreeNode left=q.poll();
            TreeNode right=q.poll();
            if(left==null&&right==null)continue;
            if(left==null^right==null)return false;
            if(left.val!=right.val)return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}

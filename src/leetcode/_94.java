package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Binary Tree Inorder Traversal Total Accepted: 78067 Total Submissions: 214785 My Submissions Question Solution
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].
 */
public class _94 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)return list;
        TreeNode p=root;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(!stack.empty()||p!=null){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }else {
                TreeNode tmp=stack.pop();
                list.add(tmp.val);
                p=tmp.right;
            }
        }
        return list;
    }
}

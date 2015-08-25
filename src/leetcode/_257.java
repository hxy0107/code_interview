package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Binary Tree Paths Total Accepted: 4220 Total Submissions: 19790 My Submissions Question Solution
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
public class _257 {
    public List<String> binaryTreePaths(TreeNode root){
        if(root==null){
            return new ArrayList<String>();
        }
        List<String> returnList=new ArrayList<String>();
        getBinaryTreePaths(returnList,root,"");
        return returnList;
    }
    private void getBinaryTreePaths(List<String> returnList,TreeNode node,String base){
        String current=base.length()==0?node.val+"":base+"->"+node.val;
        if(node.left==null&&node.right==null){
            returnList.add(current);
        }
        if(node.left!=null){
            getBinaryTreePaths(returnList,node.left,current);
            getBinaryTreePaths(returnList,node.right,current);
        }
    }

    //·ÇµÝ¹é
    public List<String> binaryTreePaths1(TreeNode root){
        Queue<TreeNode> nodes=new LinkedList<TreeNode>();
        Queue<String> strs=new LinkedList<String>();
        List<String> result=new ArrayList<String>();
        if(root!=null){
            nodes.offer(root);
            strs.offer(Integer.toString(root.val));
        }
        while(!nodes.isEmpty()){
            TreeNode node=nodes.poll();
            if(node.left==null&&node.right==null){
                result.add(strs.poll());
            }else {
                String newStr=strs.poll();
                if(node.left!=null){
                    nodes.offer(node.left);
                    strs.offer(newStr+"->"+node.left.val);
                }
                if(node.right!=null){
                    nodes.offer(node.right);
                    strs.offer(newStr+"->"+node.right.val);
                }
            }
        }
        return result;
    }
}




















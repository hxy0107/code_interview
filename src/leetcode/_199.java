package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Binary Tree Right Side View Total Accepted: 17463 Total Submissions: 62451 My Submissions Question Solution
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].
 */
public class _199 {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result=new ArrayList<Integer>();
        rightView(root,result,0);
        return result;
    }
    public void rightView(TreeNode curr,List<Integer> result,int currDepth){
        if(curr==null)return;
        if(currDepth==result.size()){
            result.add(curr.val);
        }
        rightView(curr.right,result,currDepth+1);
        rightView(curr.left,result,currDepth+1);
    }
}

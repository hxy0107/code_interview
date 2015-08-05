package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Lowest Common Ancestor of a Binary Search Tree Total Accepted: 13921 Total Submissions: 37206 My Submissions Question Solution
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: ��The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).��

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class _235 {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
      //  if(root==null||p==null||q==null)return null;
       // if(root==p||root==q)return root;
        int min=p.val>q.val?q.val:p.val;
        int max=p.val>q.val?p.val:q.val;
        if(min>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else if(max<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return root;
        }
    }

}

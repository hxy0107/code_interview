package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
/*
Unique Binary Search Trees Total Accepted: 57016 Total Submissions: 160364 My Submissions Question Solution
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
    //左子树*右子树 的个数
public class _96 {
    //time out
    public int numTrees(int n){
        if(n==0||n==1)return 1;
        int num=0;
        for(int i=1;i<=n;i++){
            num+=numTrees(i-1)*numTrees(n-i);
        }
        return num;
    }
    public int numTrees1(int n){
        int[] G=new int[n+1];
        G[0]=G[1]=1;
        for(int i=2;i<=n;++i){
            for(int j=1;j<=i;++j){
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }
}

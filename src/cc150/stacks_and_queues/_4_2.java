package cc150.stacks_and_queues;

/**
 * Created by xianyu.hxy on 2015/8/19.
 */
public class _4_2 {
    public static TreeNode addToTree(int arr[],int start,int end) {
        if(start<end){
            return null;
        }
        int mid=(end-start)/2;
        TreeNode n=new TreeNode(arr[mid]);
        n.left=addToTree(arr,start,mid-1);
        n.right=addToTree(arr,mid+1,end);
        return n;
     }
    public static TreeNode createMinimalBST(int array[]){
        return addToTree(array,0,array.length-1);
    }
}

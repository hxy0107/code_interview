package leetcode;
/*
Rotate Array Total Accepted: 37022 Total Submissions: 205019 My Submissions Question Solution
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Related problem: Reverse Words in a String II

Credits:
Special thanks to @Freezen for adding this problem and creating all test cases.
 */

import java.util.Arrays;

/**
 * Created by xianyu.hxy on 2015/8/11.
 */
public class _189 {
    public void rotate(int[] nums,int k){
        if(k>nums.length){
            k=k%nums.length;
        }

        int[] result=new int[nums.length];
        int i=0;
        for(i=0;i<k;i++){
            result[i]=nums[nums.length-k+i];
        }
        int j=0;
        for(i=k;i<nums.length;i++){
            result[i]=nums[j];
            j++;
        }
        System.arraycopy(result,0,nums,0,nums.length);
    }
    //Time out
    public void rotate1(int[] nums,int k){
        if(nums==null||k<0){
            throw new IllegalArgumentException("Illegal argument!");
        }
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }
    public void rotate2(int[] nums,int k){
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] arr,int left,int right){
        if(arr==null||arr.length==1)return;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

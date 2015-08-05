package leetcode;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Merge Sorted Array Total Accepted: 61785 Total Submissions: 211225 My Submissions Question Solution
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class _88 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            arrayList.add(nums1[i]);
        }
        for(int j=0;j<n;j++){
            arrayList.add(nums2[j]);
        }
        arrayList.sort(Comparator.<Integer>naturalOrder());
        for(int z=0;z<arrayList.size();z++){
            nums1[z]=arrayList.get(z);
        }
    }
}

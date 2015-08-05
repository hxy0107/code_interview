package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Majority Element Total Accepted: 52123 Total Submissions: 146197 My Submissions Question Solution
Given an array of size n, find the majority element. The majority element is the element that appears more than ? n/2 ? times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
 */
public class _169 {
    public  static int majorityElement(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }
       for(Map.Entry<Integer, Integer> s:map.entrySet()){
           if(s.getValue()>(nums.length/2.0)){
               return s.getKey();
           }
       }
        return 0;
    }
    public static void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        int t=majorityElement(nums);
    }
}

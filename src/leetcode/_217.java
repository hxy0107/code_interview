package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianyu.hxy on 2015/8/7.
 */
/*
Contains Duplicate Total Accepted: 26006 Total Submissions: 72137 My Submissions Question Solution
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class _217 {
    public static boolean containsDuplicate(int[] nums){
        if(nums==null||nums.length<=1)return false;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int index=0;
        while(index<nums.length){
            if(!map.containsKey(nums[index])){
                map.put(nums[index],1);
            }else{
                return true;
            }
            index++;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={};
        boolean b=containsDuplicate(nums);
        System.out.println(b);
    }
}

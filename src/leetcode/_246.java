package leetcode;

import java.util.Arrays;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/*
Valid Anagram Total Accepted: 7669 Total Submissions: 21661 My Submissions Question Solution
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class _246 {
    public static boolean isAnagram(String s,String t){
       char[] chars= s.toCharArray();
        char[] chart=t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        System.out.println(chars.equals(chart));
        return String.valueOf(chars).equals(String.valueOf(chart));
    }
    public static void main(String[] args){
        String s="a";
        String t="a";
       boolean b= isAnagram(s,t);
    }
}

package leetcode;

import java.util.HashMap;

/**
 * Created by xianyu.hxy on 2015/8/25.
 */
/*
Longest Substring Without Repeating Characters Total Accepted: 86962 Total Submissions: 429892 My Submissions Question Solution
Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class _3 {
    //time out
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    public static int lengthOfLongestSubstring1(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int rightPointer = 0, leftPointer = rightPointer - 1, answer = 0;
        while (rightPointer != s.length()) {
            Integer previousOccurrence = map.put(s.charAt(rightPointer), rightPointer);
            if (previousOccurrence != null) {
                leftPointer = Math.max(leftPointer, previousOccurrence);
            }
            answer = Math.max(answer, rightPointer - leftPointer);
            rightPointer++;
        }
        return answer;
    }
    public static void main(String[] args){
        lengthOfLongestSubstring("abcabcabcaa");
    }
}

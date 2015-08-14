package leetcode;

import java.util.Stack;

/**
 * Created by xianyu.hxy on 2015/8/7.
 */
/*
Valid Palindrome Total Accepted: 62399 Total Submissions: 283542 My Submissions Question Solution
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class _125 {
    public static boolean isPalindrome(String s){
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len=s.length();
        if(len<2)return true;

        Stack<Character> stack=new Stack<Character>();
        int index=0;
        while(index<len/2){
            stack.push(s.charAt(index));
            index++;
        }
        if(len%2==1)index++;
        while(index<len){
            if(stack.empty())return false;
            char tmp=stack.pop();
            if(s.charAt(index)!=tmp)return false;
            else index++;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("abcba"));


    }
}

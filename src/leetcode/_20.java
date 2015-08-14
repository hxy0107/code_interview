package leetcode;

import java.util.Stack;

/**
 * Created by xianyu.hxy on 2015/8/7.
 */
/*
Valid Parentheses Total Accepted: 62070 Total Submissions: 234278 My Submissions Question Solution
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class _20 {
    public static boolean isValid(String s){
        if(s==null||s.length()==0||s.length()==1)return false;
        if((s.length()%2)!=0)return false;
        Stack<Character> stack=new Stack<Character>();
        int index=0;
        while (index<s.length()){
          if(s.charAt(index)=='('||s.charAt(index)=='['||s.charAt(index)=='{'){
              stack.push(s.charAt(index));
          }
            if(s.charAt(index)==')'||s.charAt(index)==']'||s.charAt(index)=='}'){
                if(stack.empty())return false;
                if(stack.peek()=='('&&s.charAt(index)==')'||stack.peek()=='['&&s.charAt(index)==']'||stack.peek()=='{'&&s.charAt(index)=='}'){

                }else {
                    return false;
                }
                stack.pop();
            }
            index++;
        }
        if(!stack.empty())return false;
        return true;
    }
    public static void main(String[] args){
        String s="()";
        isValid(s);
        System.out.println(isValid("([])"));
    }
}

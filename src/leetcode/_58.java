package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Length of Last Word Total Accepted: 57084 Total Submissions: 206750 My Submissions Question Solution
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5.
 */
public class _58 {
    public static int lengthOfLastWord(String s){
        if(s==null||s.length()==0)return 0;
        String s1=s.trim();
        if(!s1.contains(" "))return s1.length();
        String str[]=s1.split(" ");
        if(str[str.length-1].trim()=="")return 0;
        String end=str[str.length-1];
        return end.length();
    }
    public static int lengthOfLastWord1(String s){
        if(s==null || s.length() == 0)
            return 0;

        int result = 0;
        int len = s.length();

        boolean flag = false;
        for(int i=len-1; i>=0; i--){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                flag = true;
                result++;
            }else{
                if(flag)
                    return result;
            }
        }

        return result;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("  a b   dfs  "));
    }
}

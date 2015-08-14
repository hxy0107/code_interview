package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/7.
 */
/*
Implement strStr() Total Accepted: 62416 Total Submissions: 278971 My Submissions Question Solution
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Update (2014-11-02):
The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.
 */
public class _28 {
    public int strStr(String haystack,String needle){
        if(haystack==null)return -1;
        int t=haystack.indexOf(needle);
        return t;
    }
}

package cc150.arrays_and_strings;

/**
 * Created by xianyu.hxy on 2015/8/11.
 */
/*
1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 */
public class _1_1 {
    public static boolean isUniqueChars2(String str){
        boolean[] char_set=new boolean[256];
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i);
            if(char_set[val])return false;
            char_set[val]=true;
        }
        return true;
    }
    public static boolean isUniqueChars(String str){
        int checker=0;
        for(int i=0;i<str.length();++i){
            int val=str.charAt(i)-'a';
            if((checker&(1<<val))>0)return false;
            checker|=(1<<val);
        }
        return true;
    }
}

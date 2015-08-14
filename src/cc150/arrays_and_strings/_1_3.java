package cc150.arrays_and_strings;

/**
 * Created by xianyu.hxy on 2015/8/11.
 */
/*
1 3 Design an algorithm and write code to remove the duplicate characters in a string
without using any additional buffer  NOTE: One or two additional variables are fine
An extra copy of the array is not
FOLLOW UP
Write the test cases for this method
 */
public class _1_3 {
    public static void removeDuplicates(char[] str){
        if(str==null)return;
        int len=str.length;
        if(len<2)return;
        int tail=1;

        for(int i=1;i<len;++i){
            int j;
            for(j=0;j<tail;++j){
                if(str[i]==str[j])break;
            }
            if(j==tail){
                str[tail]=str[i];
                ++tail;
            }
        }
        str[tail]=0;
        System.out.println("char[]:"+new String(str));
    }
    public static void removeDuplicatesEff(char[] str){
        if(str==null)return;
        int len=str.length;
        if(len<2)return;
        boolean[] hit=new boolean[256];
        for(int i=0;i<256;++i){
            hit[i]=false;
        }
        hit[str[0]]=true;
        int tail=1;
        for(int i=1;i<len;++i){
            if(!hit[str[i]]){
                str[tail]=str[i];
                ++tail;
                hit[str[i]]=true;
            }
        }
        str[tail]=0;
        System.out.println("char[]:"+new String(str));
    }
    public static void main(String[] args){
        char[] chars="abababa".toCharArray();
        //removeDuplicates(chars);
        removeDuplicatesEff(chars);
    }
}

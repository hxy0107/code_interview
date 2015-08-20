package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
public class _258 {
    public static int addDigits(int num){
         return 1 + (num-1) % 9;
    }
    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
}

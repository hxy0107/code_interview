package leetcode;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
public class _118 {

    public static List<List<Integer>> generate(int numRows) {
         List<List<Integer>> listList = new ArrayList<List<Integer>>();
         List<Integer> list ;
        if (numRows == 0) {
            return listList;
        }
        int i = 0, j = 0;
        for (i = 0; i < numRows; i++) {
            list = new ArrayList<Integer>();
            for (j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(listList.get(i - 1).get(j - 1) + listList.get(i - 1).get(j));
                }
            }
            listList.add(list);
        }
        return listList;
    }
    public static void main(String[] args){
        generate(3);
    }
}

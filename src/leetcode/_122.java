package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
public class _122 {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int max = 0;
        while (i < prices.length - 1) {
            if (prices[i] >=prices[i + 1]) {
                i++;
                continue;
            }
            int j=i+1;
            for (; j < prices.length ; j++) {
                if (j<prices.length-1&&prices[j] <= prices[j + 1]) {
                    continue;
                }
                max += prices[j] - prices[i];
                break;
            }
            i = j + 1;
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices=new int[]{5,3,6,7,8,9};
        System.out.println(maxProfit(prices));
    }
}

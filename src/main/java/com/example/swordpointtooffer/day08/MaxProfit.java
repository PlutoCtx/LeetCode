package com.example.swordpointtooffer.day08;

/**
 * 剑指 Offer 63. 股票的最大利润
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/1 16:30
 * @since JDK17
 */

public class MaxProfit {

    /**
     * 我写的
     * 执行用时: 296 ms
     * 内存消耗: 41.1 MB
     * 股票的最大利润
     * @param prices    股票的价格
     * @return  最大利润
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }


    /**
     * 参考代码
     * 执行用时： 0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了42.85%的用户
     * 通过测试用例：200 / 200
     * 股票的最大利润
     * @param prices    股票的价格
     * @return  最大利润
     */
    public int maxProfit02(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices){
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }

        return profit;
    }
}

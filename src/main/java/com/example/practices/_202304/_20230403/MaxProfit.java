package com.example.practices._202304._20230403;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/3 17:59
 * @since JDK17
 */

public class MaxProfit {

    /**
     * 参考代码
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：57.3 MB, 在所有 Java 提交中击败了69.21%的用户
     * 通过测试用例：211 / 211
     * @param prices    数组
     * @return  最大利润
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }


    /**
     * 精选代码
     * 执行用时：2 ms, 在所有 Java 提交中击败了56.11%的用户
     * 内存消耗：54.5 MB, 在所有 Java 提交中击败了73.81%的用户
     * 通过测试用例：211 / 211
     * @param prices    数组
     * @return  最大利润
     */
    public int maxProfit02(int[] prices) {
        // 计算差分数组
        // [7,  1, 5,  3, 6,  4] 前缀和
        // [7, -6, 4, -2, 3, -2] 差分数组
        // [0, -6, 4, -2, 3, -2] 后一天相对于前一天的盈利
        int[] minusArr = new int[prices.length];
        minusArr[0] = prices[0];
        for (int i = 1; i < minusArr.length; i++) {
            minusArr[i] = prices[i] - prices[i-1];
        }
        int profit = 0;
        int max = 0;
        for (int i = 1; i < minusArr.length; i++) {
            profit += minusArr[i];
            if (profit < 0) {
                profit = 0;
            }
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }


}

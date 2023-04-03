package com.example.practices._20230403;

import java.util.logging.Logger;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/3 17:59
 * @since JDK17
 */

public class MaxProfit {

    /*
     * 我写的 错的，暴力的解法你自己写，能用，但会超出时间限制，因为时间复杂度是O(n^2)
     * @param prices    数组
     * @return  最大利润
     */
    /*
    public static int maxProfit(int[] prices) {
        int[] max;
        max = findMax(prices, 0, prices.length);
        int[] min;
        min = findMin(prices, 0, prices.length);

        if (max[1] < min[1]){
            return max[0] - min[0];
        }else {
            max = findMax(prices, 0, min[1]);
            min = findMin(prices, max[1], prices.length);
            if (max[1]< min[1]){
                return max[0] - min[0];
            }
        }
        return 0;
    }


    public static int[] findMax(int[] nums, int start, int end){
        int[] temp01 = new int[2];
        temp01[0] = nums[start];
        temp01[1] = start;

        for (int i = start + 1; i < end; i++){
            if (temp01[0] < nums[i]){
                temp01[0] = nums[i];
                temp01[1] = i;
            }
        }
        return temp01;
    }

    public static int[] findMin(int[] nums, int start, int end){
        int[] temp02 = new int[2];
        temp02[0] = nums[start];
        temp02[1] = start;

        for (int i = start + 1; i < end; i++){
            if (temp02[0] > nums[i]){
                temp02[0] = nums[i];
                temp02[1] = i;
            }
        }
        return temp02;
    }
*/
    /*
    public static void main(String[] args) {
        int[] prices = {
                7,1,5,3,6,4
        };
        Logger.getGlobal().info("" + maxProfit(prices));
    }
*/

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

package com.example.practices._202303._20230331;

/**
 * 1672. 最富有客户的资产总量
 * 给你一个 m * n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/richest-customer-wealth">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/31 23:17
 * @since JDK17
 */

public class RichestCustomerWealth {

    /**
     * 参考代码
     * 34 / 34 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 40.9 MB
     * @param accounts  数组
     * @return  最富有客户的资产总量
     */
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++){
            int temp = 0;
            for(int j = 0; j < accounts[i].length; j++){
                temp += accounts[i][j];

            }
            max = Math.max(max, temp);
        }
        return max;

    }


    /**
     * 34 / 34 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 41 MB
     * @param accounts  数组
     * @return  最富有客户的资产总量
     */
    public int maximumWealth02(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int temp = 0;
            for (int j = 0; j < account.length; j++) {
                temp += account[j];
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max;

    }


}

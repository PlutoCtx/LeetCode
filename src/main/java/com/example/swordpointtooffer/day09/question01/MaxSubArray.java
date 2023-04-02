package com.example.swordpointtooffer.day09.question01;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/2 20:14
 * @since JDK17
 */

public class MaxSubArray {
    /**
     * 参考代码
     * 执行结果：通过
     * 显示详情
     * 查看示例代码
     * 添加备注
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.6 MB, 在所有 Java 提交中击败了96.83%的用户
     * 通过测试用例：202 / 202
     * @param nums  数组
     * @return  最大
     */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}

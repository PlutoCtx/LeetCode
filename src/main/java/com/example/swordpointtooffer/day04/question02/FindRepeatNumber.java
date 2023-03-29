package com.example.swordpointtooffer.day04.question02;

/**
 * 剑指 Offer 03. 数组中重复的数字
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/29 20:23
 * @since JDK17
 */

public class FindRepeatNumber {

    /**
     * 我写的
     * 27 / 27 个通过测试用例
     * 状态：通过
     * 执行用时: 2399 ms
     * 内存消耗: 48.4 MB
     *
     * @param nums  数组
     * @return  重复值
     */
    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }


    /**
     * 示例代码
     * 27 / 27 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 48.3 MB
     * @param nums  数组
     * @return  重复值
     */
    public int findRepeatNumber02(int[] nums) {

        int length = nums.length;
        int index = 0;
        int temp;

        while (index < length) {

            if (nums[index] == index) {
                index++;
                continue;
            }

            if (nums[index] == nums[nums[index]]) {
                return nums[index];
            }

            temp = nums[nums[index]];
            nums[nums[index]] = nums[index];
            nums[index] = temp;
        }

        return 0;
    }


}

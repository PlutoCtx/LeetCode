package com.example.swordpointtooffer.day05.question01;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/29 20:13
 * @since JDK17
 */

public class MinArray {

    /**
     * 我写的
     * 192 / 192 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 41.1 MB
     * @param numbers   数组
     * @return  最小值
     */
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

}

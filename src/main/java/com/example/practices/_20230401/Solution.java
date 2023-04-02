package com.example.practices._20230401;

/**
 * 6327. 从两个数字数组里生成最小数字
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/1 23:46
 * @since JDK17
 */

public class Solution {

    public int minNumber(int[] nums1, int[] nums2) {
        int temp01 = 10;
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k && temp01 > j) {
                    temp01 = j;
                    break;
                }
            }
        }

        int temp02 = findMin(nums1);
        int temp03 = findMin(nums2);
        int temp04 = 0;
        if (temp02 > temp03) {
            temp04 = temp03 * 10 + temp02;
        }else {
            temp04 = temp02 * 10 + temp03;
        }

        return Math.min(temp04, temp01);
    }

    public static int findMin(int[] nums){
        int temp = nums[0];
        for (int num : nums) {
            if (temp > num) {
                temp = num;
            }
        }
        return temp;
    }


}

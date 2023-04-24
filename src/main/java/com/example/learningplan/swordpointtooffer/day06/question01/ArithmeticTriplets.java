package com.example.learningplan.swordpointtooffer.day06.question01;

/**
 * 2367. 算术三元组的数目
 * 给你一个下标从 0 开始、严格递增 的整数数组 nums 和一个正整数 diff 。如果满足下述全部条件，则三元组 (i, j, k) 就是一个 算术三元组 ：
 * i < j < k ，
 * nums[j] - nums[i] == diff 且
 * nums[k] - nums[j] == diff
 * 返回不同 算术三元组 的数目。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/number-of-arithmetic-triplets">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/31 14:57
 * @since JDK17
 */

public class ArithmeticTriplets {


    /**
     * 我写的
     * @param nums  数组
     * @param diff 差值
     * @return  三元组数目
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        for(int i = 0; i < nums.length; i ++ ){
            for(int j = i; j < nums.length; j++){
                for(int k = j; k < nums.length; k++){
                    if(i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        res++;
                    }
                }
            }
        }
        return res;
    }


    /**
     * 参考代码
     * @param nums  数组
     * @param diff 差值
     * @return  三元组数目
     */
    public int arithmeticTriplets02(int[] nums, int diff) {
        int ans = 0;
        int length = nums.length;
        int max = nums[length - 1];

        for (int i = 0; i < length - 2; i++) {
            // 如果当前元素加上 两倍diff > max，则后面的数一定也不满足
            if (nums[i] + 2 * diff > max) {
                break;
            }

            // 从 [i + 1, length - 1]区间中找是否存在 nums[i] + diff
            int j = find(nums[i] + diff, i + 1, length - 1, nums);

            if (j == -1) {
                continue;
            }

            int k = find(nums[i] + 2 * diff, i + 1, length - 1, nums);

            if (k != -1) {
                ans++;
            }
        }

        return ans;
    }

    /**
     * 查找是否符合的数
     * @param target    目标值
     * @param left  最左边
     * @param right 最右边
     * @param nums  被查找的数组
     * @return  -1 或者 符合条件书数的下标
     */
    private int find(int target, int left, int right, int[] nums) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


}

package com.example.learningplan.springrecruitment.day01.question01;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/3 10:38
 * @since JDK17
 */

public class TwoSum {

    /**
     * 我写的
     * 57 / 57 个通过测试用例
     * 状态：通过
     * 执行用时: 80 ms
     * 内存消耗: 41.6 MB
     * @param nums  数组
     * @param target    目标
     * @return  返回下标
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    /**
     * 精选代码
     * 执行结果：通过
     * 显示详情
     * 查看示例代码
     * 执行用时：2 ms, 在所有 Java 提交中击败了76.96%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了69.15%的用户
     * 通过测试用例：57 / 57
     * @param nums  数组
     * @param target    目标
     * @return  返回下标
     */
    public int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

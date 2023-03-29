package com.example.swordpointtooffer.day04.question03;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/29 20:53
 * @since JDK17
 */

public class MissingNumber {

    /**
     * 我写的
     * 122 / 122 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 42.2 MB
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了45.93%的用户
     * 通过测试用例：
     * 122 / 122
     * @param nums  数组
     * @return  缺失值
     */
    public int missingNumber(int[] nums) {
        int index = 0;
        while(index < nums.length){
            if(index == nums[index]){
                index++;
            }else{
                break;
            }
        }
        return index;
    }


    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了96.88%的用户
     * 通过测试用例：122 / 122
     * @param nums  数组
     * @return  缺失值
     */
    public int missingNumber02(int[] nums) {
        int out = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                out = i;
                return i;
            }
        }
        return out;
    }

}

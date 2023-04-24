package com.example.learningplan.swordpointtooffer.day06.question03;

/**
 * 1991. 找到数组的中间位置
 * 给你一个下标从 0开始的整数数组nums，请你找到 最左边的中间位置middleIndex（也就是所有可能中间位置下标最小的一个）。
 * 中间位置middleIndex是满足nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1]的数组下标。
 * 如果middleIndex == 0，左边部分的和定义为 0。类似的，如果middleIndex == nums.length - 1，右边部分的和定义为0。
 * 请你返回满足上述条件 最左边的middleIndex，如果不存在这样的中间位置，请你返回-1。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/find-the-middle-index-in-array">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/31 15:07
 * @since JDK17
 */

public class FindMiddleIndex {

    /**
     * 我改写的，比原先的要快，建议写个题解
     * 执行结果：通过
     * 显示详情
     * 查看示例代码
     * 添加备注
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了86.47%的用户
     * 通过测试用例：294 / 294
     * @param nums  被查数组
     * @return  数组左右值相等的中间位置
     */
    public int findMiddleIndex(int[] nums) {

        int l = 0;
        int r = 0;

        for (int num : nums) {
            r += num;
        }

        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                l += nums[i - 1];
            }
            r -= nums[i];

            if(l == r){
                return i;
            }
        }
        return -1;
    }
}

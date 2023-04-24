package com.example.learningplan.springrecruitment.day02.question02;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第 K 大元素
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:29
 * @since JDK17
 */

class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    /**
     * 参考代码
     * 执行用时：12 ms, 在所有 Java 提交中击败了93.24%的用户
     * 内存消耗：45.7 MB, 在所有 Java 提交中击败了36.00%的用户
     * 通过测试用例：10 / 10
     * @param k k
     * @param nums  数组
     */
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for(int x : nums){
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}

/*
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

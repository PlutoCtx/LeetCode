package com.example.springrecruitment.day03.question01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 232. 用栈实现队列
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:49
 * @since JDK17
 */

public class MyQueue {

    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了43.89%的用户
     * 通过测试用例： 22 / 22
     * 作者：LeetCode-Solution
     * 链接：<a href="https://leetcode.cn/problems/implement-queue-using-stacks/solution/yong-zhan-shi-xian-dui-lie-by-leetcode-s-xnb6/">...</a>
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }

}

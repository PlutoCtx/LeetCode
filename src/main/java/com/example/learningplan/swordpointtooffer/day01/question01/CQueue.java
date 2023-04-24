package com.example.learningplan.swordpointtooffer.day01.question01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/25 18:27
 * @since JDK17
 */



public class CQueue {
    /**
     * 输入栈
     */
    Deque<Integer> inStack;
    /**
     * 输出栈
     */
    Deque<Integer> outStack;

    /**
     * 初始化构造方法
     */
    public CQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    /**
     * 将输入值推入栈
     * @param value 输入值
     */
    public void appendTail(int value) {
        inStack.push(value);
    }

    /**
     * 删除栈首
     * @return  返回值
     */
    public int deleteHead() {
        if (outStack.isEmpty()){
            if (inStack.isEmpty()){
                return -1;
            }
            in2out();
        }
        return outStack.pop();
    }

    /**
     * 将输入栈的数据推到输出栈
     */
    private void in2out(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}





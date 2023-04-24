package com.example.learningplan.swordpointtooffer.day01.question01;

import java.util.Stack;

/**
 * 用户提交的代码
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/25 19:24
 * @since JDK17
 */

class CQueue01 {
    /**
     * 输入栈
     */
    private Stack<Integer> inStack;
    /**
     * 输出栈
     */
    private Stack<Integer> outStack;

    /**
     * 初始化构造方法
     */
    public CQueue01() {
        inStack = new Stack<>();
        outStack = new Stack<>();
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
        if (! outStack.isEmpty()){
            return outStack.pop();
        }else {
            while (! inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
            return outStack.isEmpty() ? -1: outStack.pop();
        }
    }
}
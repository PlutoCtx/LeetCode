package com.example.swordpointtooffer.day01.question02;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 * 执行用时：14 ms, 在所有 Java 提交中击败了31.44% 的用户
 * 内存消耗：43.5 MB, 在所有 Java 提交中击败了43.66%的用户
 * 通过测试用例：19 / 19
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/25 19:19
 * @since JDK17
 */



class MinStack {

    Stack<Integer> A, B;

    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.empty() || B.peek() >= x){
            B.add(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())){
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
package com.example.learningplan.swordpointtooffer.day01.question01;

/**
 * reference code
 * 执行用时：31 ms, 在所有 Java 提交中击败了99.97%的用户
 * 内存消耗：49.2 MB, 在所有 Java 提交中击败了22.91%的用户
 * 通过测试用例：55 / 55
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/25 19:13
 * @since JDK17
 */

public class CQueue02 {
    private final int[] line;
    private int head;
    private int tail;

    public CQueue02() {
        line=new int[5000];
        head=0;
        tail=0;
    }

    public void appendTail(int value) {
        line[tail]=value;
        tail++;
    }

    public int deleteHead() {
        if(head==tail){
            return -1;
        }
        head++;
        return line[head-1];
    }
}



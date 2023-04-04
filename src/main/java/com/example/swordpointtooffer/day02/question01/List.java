package com.example.swordpointtooffer.day02.question01;

import java.util.LinkedList;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/26 21:58
 * @since JDK17
 */

public class List {

//    ArrayList<Integer> tmp = new ArrayList<Integer>();
//
//    public int[] reversePrint(ListNode head){
//        recur(head);
//        int[] res = new int[tmp.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = tmp.get(i);
//        }
//        return res;
//    }
//    void recur(ListNode head){
//        if (head == null) {
//            return;
//        }
//        recur(head.next);
//        tmp.add(head.val);
//    }

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }

}


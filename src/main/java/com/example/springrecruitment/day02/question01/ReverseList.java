package com.example.springrecruitment.day02.question01;

/**
 * 206. 反转链表
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:01
 * @since JDK17
 */

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr;
        ListNode next;

        curr = head;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

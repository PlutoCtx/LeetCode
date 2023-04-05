package com.example.springrecruitment.day02.question01;

/**
 * singly-linked list
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:00
 * @since JDK17
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

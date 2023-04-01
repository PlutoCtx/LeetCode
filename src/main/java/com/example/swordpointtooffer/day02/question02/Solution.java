//package com.example.swordpointtooffer.day02.question02;
//
//import java.util.List;
//
///**
// * 剑指 Offer 24. 反转链表
// *
// * @author MaxBrooks 15905898514@163.com
// * @version 2023/3/26 22:11
// * @since JDK17
// */
//
//public class Solution {
//
//    public ListNode reverseList(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null){
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//}

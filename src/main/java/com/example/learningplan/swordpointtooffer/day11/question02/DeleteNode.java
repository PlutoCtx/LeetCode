package com.example.learningplan.swordpointtooffer.day11.question02;

/**
 * 剑指 Offer 18. 删除链表的节点
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/4 21:35
 * @since JDK17
 */

public class DeleteNode {

    /**
     * 精选代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了10.86%的用户
     * 通过测试用例：37 / 37
     * @param head  头结点
     * @param val   要删除的节点的值
     * @return  新的头结点
     */
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;

        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        if(cur != null){
            pre.next = cur.next;
        }
        return head;
    }


    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了90.54%的用户
     * 通过测试用例：37 / 37
     * @param head  头结点
     * @param val   要删除的节点的值
     * @return  新的头结点
     */
    public ListNode deleteNode02(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur.next = null;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }


}

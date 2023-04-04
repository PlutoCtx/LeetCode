package com.example.swordpointtooffer.day11.question01;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/4 21:05
 * @since JDK17
 */

public class KthFromEnd {

    /**
     * 精选代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了85.67%的用户
     * @param head  ListNode
     * @param k 倒数第k个
     * @return  倒数第k个节点
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int t = 0;
        while(fast != null){
            if(t >= k){
                slow = slow.next;
            }
            fast = fast.next;
            t++;
        }
        return slow;
    }

    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了24.68%的用户
     * @param head  ListNode
     * @param k 倒数第k个
     * @return  倒数第k个节点
     */
    public ListNode getKthFromEnd02(ListNode head, int k) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null) {
            fastNode = fastNode.next;
            if (k == 0) {
                slowNode = slowNode.next;
            } else {
                k--;
            }
        }
        return slowNode;
    }
}

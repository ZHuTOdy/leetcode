package org.zhu.leetcode;

/**
 * @ClassName ReverseLinkedList
 * @Description 反转链表
 * @Author 朱镕杰
 * @Date 2022/1/7 6:16 PM
 **/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

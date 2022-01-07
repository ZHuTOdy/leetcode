package org.zhu.leetcode;

import org.zhu.leetcode.base.ListNode;

/**
 * @ClassName ReverseLinkedList
 * @Description Day 2 反转链表
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
}

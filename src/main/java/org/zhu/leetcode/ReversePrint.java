package org.zhu.leetcode;

import org.zhu.leetcode.base.ListNode;

/**
 * @ClassName ReversePrint
 * @Description Day 2 从尾到头打印链表
 * @Author 朱镕杰
 * @Date 2022/1/7 6:22 PM
 **/
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] nums = new int[count];
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = head.val;
            head = head.next;
        }
        return nums;
    }
}

package org.zhu.leetcode;

import org.zhu.leetcode.base.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CopyRandomList
 * @Description Day 2 复制复杂链表
 * @Author 朱镕杰
 * @Date 2022/1/9 3:16 PM
 **/
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        for (Node node = head; node != null; node = node.next) {
            map.put(node, new Node(node.val));
        }
        for (Node node = head; node != null; node = node.next) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
        }
        return map.get(head);
    }

}

package com.hl.arithmetic.node;

/**
 * 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 *
 * @Author mahl
 * @Date 2019-01-27
 */
public class RemoveNthFromEndTest {

    public static void main(String[] args) {
    }

    public ListNode method(ListNode head, int n) {
        ListNode nodeFast = head;
        ListNode nodeSlow = head;
        while (n > 0) {
            n--;
            nodeFast = nodeFast.next;
        }
        if (nodeFast == null) {
            //要移除的是头节点,返回原头节点的后一个节点为新的头节点
            return nodeSlow.next;
        }
        while ((nodeFast = nodeFast.next) != null) {
            nodeSlow = nodeSlow.next;
        }
        //当nodeFast走到最后时，nodeSlow走到倒数n+1的位置
        nodeSlow.next = nodeSlow.next.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return slow.next;
        }
        while ((fast = fast.next) != null) {
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

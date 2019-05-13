package com.hl.arithmetic.node;

/**
 * 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @Author mahl
 * @Date 2019-01-27
 */
public class ReverseListTest {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        printNode(reverse(l1));
    }

    private static ListNode reverse(ListNode head) {
        ListNode result = null;
        ListNode temp = null;
        while (head != null) {
            temp = head.next;
            head.next = result;
            result = head;
            head = temp;
        }
        return result;
    }

    private static void printNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + ",");
            listNode = listNode.next;
        }
        System.out.println();
    }
}

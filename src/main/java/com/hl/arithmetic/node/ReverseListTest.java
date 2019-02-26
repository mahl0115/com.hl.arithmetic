package com.hl.arithmetic.node;

/**
 * 反转链表
 *
 * @Author mahl
 * @Date 2019-01-27
 */
public class ReverseListTest {

    public static void main(String[] args) {
    }

    private static ListNode method(ListNode head) {
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;
        while(currentNode != null) {
            nextNode = currentNode.next;
            
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;
    }
}

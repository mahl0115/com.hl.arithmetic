package com.hl.arithmetic;

/**
 * 反转一个单向链表
 *
 * @Author mahl
 * @Date 2018-12-23
 */
public class ReverseLinkedListTest {

    public static void main(String[] args) {
        int target = 30;
        int[] array = {1, 1, 2, 4, 5, 6, 9, 12, 24, 56, 78};

        method1(array, target);
        method2(array, target);
    }

    /**
     * 反转
     * 时间复杂度<O(n^2)
     */
    private static void method1(int[] array, int target) {

    }

    /**
     * 时间复杂度<O(n)
     */
    private static void method2(int[] array, int target) {

    }

    /**
     * 节点类
     */
    class Node {
        /**
         * 当前节点
         */
        int index;
        /**
         * 下一个节点
         */
        Node next;

        public Node(int index, Node next) {
            this.index = index;
            this.next = next;
        }
    }
}

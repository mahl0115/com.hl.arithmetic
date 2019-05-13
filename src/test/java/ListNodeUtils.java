/**
 * 链表工具
 *
 * @Author mahl
 * @Date 2019-03-23
 */
public class ListNodeUtils {

    public static void printNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + ",");
            listNode = listNode.next;
        }
        System.out.println();
    }
}

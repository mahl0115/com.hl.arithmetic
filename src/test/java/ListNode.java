/**
 * @Author mahl
 * @Date 2019-03-14
 */
public class ListNode {

    /**
     * 当前节点
     */
    int val;
    /**
     * 下一个节点
     */
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

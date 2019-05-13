import java.util.*;

/**
 * @Author mahl
 * @Date 2019-03-14
 */
public class Practise {

    public static void main(String[] args) {
//        feibolaqi(10);
//
//        from1ToN(100);
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(twoSum(array, 13)));
//
//        int[] array2 = {1, 2, 3, 1, 5, 6, 7};
//        System.out.println(containsDuplicate(array2));
//
//        int[] array3 = {1, 2, 3, 1, 5, 6, 7};
//        System.out.println(deleteDuplicate(array2));
//
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
//        int[] nums3 = {4, 9, 5};
//        int[] nums4 = {9, 4, 9, 8, 4};
//        System.out.println(Arrays.toString(intersect(nums3, nums4)));
//
//        int[] nums5 = {1, 1, 2, 2};
//        int[] nums6 = {2, 2};
//        int[] nums7 = {4, 5, 9};
//        int[] nums8 = {4, 4, 8, 9, 9};
//        System.out.println(Arrays.toString(intersect2(nums7, nums8)));
//
//        int[] nums = {0, 1, 0, 3, 12};
//        System.out.println(Arrays.toString(moveZero(nums)));

        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(7);
        ListNodeUtils.printNode(mergeTwoLists(l1, l2));
    }

    /**
     * 合并两个有序链表
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        ListNode result = new ListNode(0);
        ListNode cur = result;
        while(l1 != null || l2 != null){
            if(l1 == null){
                cur.next = l2;
                break;
            } else if(l2 == null){
                cur.next = l1;
                break;
            } else if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        return result.next;
    }

    /**
     * @param nums
     * @return
     */
    private static int[] moveZero(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
        return nums;
    }

    /**
     * 两个数组的交集 II
     * 给定两个排好序的数组
     * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
     * 我们可以不考虑输出结果的顺序。
     */
    private static int[] intersect2(int[] nums3, int[] nums4) {
        int[] result = new int[Math.max(nums3.length, nums4.length)];
        int i = 0, j = 0, index = 0;
        while (i < nums3.length && j < nums4.length) {
            if (nums3[i] == nums4[j]) {
                result[index] = nums3[i];
                i++;
                j++;
                index++;
            } else if (nums3[i] > nums4[j]) {
                j++;
            } else if (nums3[i] < nums4[j]) {
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

    /**
     * 两个数组的交集
     * 输出结果中的每个元素一定是唯一的。
     * 我们可以不考虑输出结果的顺序。
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set.remove(nums2[i]);
                result[index++] = nums2[i];
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

    /**
     * 删除重复项，返回剩余长度(不重复都往前移)
     */
    private static int deleteDuplicate(int[] array3) {
        int i = 0;
        for (int k = 1; k < array3.length; k++) {
            if (array3[i] != array3[k]) {
                array3[i + 1] = array3[k];
                i++;
            }
        }
        return i + 1;
    }

    /**
     * 是否存在重复元素
     */
    private static boolean containsDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            } else {
                set.add(array[i]);
            }
        }
        return false;
    }

    /**
     * 找出加和为指定数字的两个数的下标
     */
    private static int[] twoSum(int[] array, int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(num - array[i])) {
                return new int[]{i, array[i]};
            } else {
                map.put(array[i], i);
            }
        }
        return null;
    }

    /**
     * 反转链表
     */
    public static ListNode reverseList(ListNode head) {
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

    private static void from1ToN(int i) {
        System.out.println((1 + i) * i / 2);
    }

    /**
     * 斐波拉契数列
     * F(n) = F(n-1) + F(n-2)
     */
    private static void feibolaqi(int length) {
        if (length == 0 || length == 1) {
            return;
        }
        int[] result = new int[length];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        System.out.println(Arrays.toString(result));
    }

    private static int process(int i, int j) {
        System.out.println(i + j);
        return i + j;
    }

}

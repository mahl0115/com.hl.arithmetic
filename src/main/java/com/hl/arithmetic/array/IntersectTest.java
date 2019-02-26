package com.hl.arithmetic.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * @Author mahl
 * @Date 2019-01-20
 */
public class IntersectTest {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
//        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums3, nums4)));
//        System.out.println(Arrays.toString(intersect(nums3, nums4)));

    }

    /**
     * 3ms
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num1 : nums1) {
            if (!set.contains(num1)) {
                set.add(num1);
            }
        }

        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int i = 0;
        for (int num2 : nums2) {
            if (set.contains(num2)) {
                set.remove(num2);
                result[i] = num2;
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, i);
    }
}

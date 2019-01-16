package com.hl.arithmetic.array;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 *
 * @Author mahl
 * @Date 2019-01-10
 */
public class RotateTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {-1, -100, 3, 99};

        int k = 3;
        method(array2, k);
        System.out.println("移动后的数组为: " + Arrays.toString(array2));
    }

    public static void method(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        //整体反转
        reverse(nums, 0, n - 1);
        //左半部分反转
        reverse(nums, 0, k - 1);
        //右半部分反转
        reverse(nums, k, n - 1);
    }


    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}

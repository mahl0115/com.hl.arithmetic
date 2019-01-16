package com.hl.arithmetic.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * @Author mahl
 * @Date 2019-01-16
 */
public class ContainsDuplicateTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] array4 = {7, 3, 2, 1, 2};

        long start = System.currentTimeMillis();
        //System.out.println(method(array2));
        System.out.println(containsDuplicate(array4));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static boolean method(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    /**
     * 有限数字取得优势
     */
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
                System.out.println("--" + Arrays.toString(nums));
            }
            nums[j + 1] = temp;
            if (j >= 0 && nums[j] == nums[j + 1]) {
                return true;
            }
        }
        return false;
    }

}

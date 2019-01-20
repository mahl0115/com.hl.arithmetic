package com.hl.arithmetic.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @Author mahl
 * @Date 2019-01-16
 */
public class SingleNumberTest {

    public static void main(String[] args) {
        int[] array = {2, 2, 1};
        int[] array2 = {4, 1, 2, 1, 2};
        int[] array3 = {1,0,1};

        //System.out.println("结果为: " + method(array2));
        System.out.println("结果为: " + singleNumber2(array3));
    }

    /**
     * 比较法
     */
    public static int method(int[] nums) {
        Arrays.sort(nums);  // 排序数组
        for (int i = 0; i < nums.length - 1; i += 2) {
            // 找到不相等的一组，直接返回
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        // 如果没有找到不相等的一组数据，直接返回数组的最后一个数字
        return nums[nums.length - 1];
    }

    /**
     * 去重法
     */
    public static int singleNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // add成功返回true，如果set中已有相同数字，则add方法会返回false
            if (!set.add(nums[i])) {
                // 删除重复出现的数字
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }

    /**
     * 求差法
     */
    public static int singleNumber3(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 偶数下标位置 num += nums[i]，奇数下标位置 num -= nums[i]
            num = i % 2 == 0 ? num + nums[i] : num - nums[i];
        }
        return num;
    }

    /**
     * 思路：根据异或运算的特点，相同的数字经过异或运算后结果为0，除单独出现一次的数字外，其他数字都是出现两次的，那么这些数字经过异或运算后结果一定是0。
     * 而任何数字与0进行异或运算都是该数字本身。所以对数组所有元素进行异或运算，运算结果就是题目的答案。
     */
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}

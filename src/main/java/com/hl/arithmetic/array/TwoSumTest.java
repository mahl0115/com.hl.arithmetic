package com.hl.arithmetic.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Author mahl
 * @Date 2019-01-21
 */
public class TwoSumTest {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //System.out.println(Arrays.toString(method(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums2 = {2, 5, 5, 11};
        int target2 = 10;
        //System.out.println(Arrays.toString(method(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

    }

    private static int[] method(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

package com.hl.arithmetic.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两个数组的交集 II
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * @Author mahl
 * @Date 2019-01-20
 */
public class IntersectTest {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(method(nums1, nums2)));
//        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(method(nums3, nums4)));
//        System.out.println(Arrays.toString(intersect(nums3, nums4)));

    }

    /**
     * 8ms
     */
    private static int[] method(int[] nums1, int[] nums2) {
        int[] result = new int[Math.max(nums1.length, nums2.length)];

        Map<Integer, Integer> map = groupToMap(nums1);
        Map<Integer, Integer> map2 = groupToMap(nums2);

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer entryKey = entry.getKey();
            Integer map2Value = map2.get(entryKey);
            Integer entryValue = entry.getValue();
            if (map2Value != null) {
                int min = entryValue > map2Value ? map2Value : entryValue;
                index = addResult(result, index, entryKey.intValue(), min);
            } else {
                continue;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

    private static int addResult(int[] result, int index, int entryKey, int min) {
        while (min > 0) {
            result[index] = entryKey;

            index++;
            min--;
        }
        return index;
    }

    private static Map<Integer, Integer> groupToMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map;
    }

    /**
     * 2ms
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[Math.max(nums1.length, nums2.length)];

        //i遍历nums1
        //j遍历nums2
        //k给最终数组赋值
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}

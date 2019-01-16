package com.hl.arithmetic;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 找到数组中加和为指定数值的两个数字的下标
 *
 * @Author mahl
 * @Date 2018-12-23
 */
public class TwoSumTest {

    public static void main(String[] args) {
        int target = 30;
        int[] array = {1, 1, 2, 4, 5, 6, 9, 12, 24, 56, 78};

        method1(array, target);
        method2(array, target);
    }

    /**
     * 直接遍历
     * 时间复杂度<O(n^2)
     */
    private static void method1(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
    }

    /**
     * i iValue map.put
     * 0   1    1,0
     * 1   1    1,1
     * 2   2    2,2
     * 3   4    4,3
     * 4   5    5,4
     * 5   6    6,5
     * 6   9    9,6
     * 7   12   12,7
     * 8   24
     * 时间复杂度<O(n)
     */
    private static void method2(int[] array, int target) {
        //key 为下标对应的值   value 为下标
        Map map = Maps.newHashMap();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target - array[i])) {
                System.out.println(i + "," + map.get(target - array[i]));
                return;
            }
            map.put(array[i], i);
        }
    }
}

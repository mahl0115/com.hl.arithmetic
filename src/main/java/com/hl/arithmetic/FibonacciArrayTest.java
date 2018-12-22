package com.hl.arithmetic;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * 斐波拉契数组
 * 1, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, ...
 * F(n) = F(n-1) + F(n-2)
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class FibonacciArrayTest {

    /**
     * 打印出F(n) = F(n-1) + F(n-2)的数列,打印20个
     */
    public static void main(String[] args) {
        int length = 20;
        method1(length);
        method2(length);
        method3(length);
    }

    /**
     * 非递归算法
     * O(n)
     */
    private static void method1(int length) {
        int[] array = new int[length];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 非递归算法
     * O(n)
     */
    private static void method2(int length) {
        List<Integer> list = Lists.newArrayList(1, 1);
        int a = 1;
        int b = 1;
        for (int i = 1; i < length - 1; i++) {
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        System.out.println(list);
    }

    /**
     * 递归算法(效率最低)
     * 时间复杂度：O(2^(N/2))<=T(N)<=O(2^N)
     */
    private static void method3(int length) {
        List<Integer> list = Lists.newArrayListWithCapacity(length);
        for (int i = 0; i < length; i++) {
            list.add(calculate(i));
        }
        System.out.println(list);
    }

    private static int calculate(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return calculate(i - 1) + calculate(i - 2);
        }
    }
}

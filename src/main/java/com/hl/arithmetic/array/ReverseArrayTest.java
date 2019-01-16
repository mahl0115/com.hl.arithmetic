package com.hl.arithmetic.array;

import java.util.Arrays;

/**
 * 反转数组
 * <p>
 * 将一个数组从头尾反转
 *
 * @Author mahl
 * @Date 2019-01-13
 */
public class ReverseArrayTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        method(array2);
        method2(array2);
    }

    private static void method2(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int tmp;
        while (start < end) {
            tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void method(int[] array) {
        int j = array.length - 1;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            if (i >= j) {
                break;
            }
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            j--;
        }
        System.out.println(Arrays.toString(array));
    }
}

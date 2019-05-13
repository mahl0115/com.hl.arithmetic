package com.hl.arithmetic.array;

import java.util.Arrays;

/**
 * 从排序数组中删除重复项
 * 条件：给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 双指针法
 *
 * @Author mahl
 * @Date 2019-01-06
 */
public class DeleteDuplicatesTest {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        method(array);
    }

    private static void method(int[] array) {
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                array[i + 1] = array[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(i + 1);
    }
}

package com.hl.arithmetic;

import java.util.Arrays;

/**
 * @Author mahl
 * @Date 2019-04-21
 */
public class QucikSortTest {

    private static final int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

    public static void main(String[] args) {
        quicksort(0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int i, int j) {
        //当i大于等于j时，停止
        if (i >= j) {
            return;
        }

        int middle = array[i];
        int left = i;
        int right = j;
        i++;
        while (i < j) {
            while (i < j && array[j] > middle) {
                j--;
            }
            while (i < j && array[i] < middle) {
                i++;
            }
            swap(i, j);
        }
        swap(left, i);

        quicksort(left, i - 1);
        quicksort(j + 1, right);
    }

    private static void swap(int i, int j) {
        int k = array[i];
        array[i] = array[j];
        array[j] = k;
    }


}

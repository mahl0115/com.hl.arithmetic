package com.hl.arithmetic.array;

/**
 * 买卖股票的最佳时机
 *
 * @Author mahl
 * @Date 2019-01-06
 */
public class MaxProfitTest {

    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.println(method(array));

    }

    private static int method(int[] array) {
        int maxprofit = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                maxprofit += array[i] - array[i - 1];
            }
        }
        return maxprofit;
    }
}

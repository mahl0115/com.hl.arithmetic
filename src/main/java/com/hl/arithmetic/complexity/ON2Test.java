package com.hl.arithmetic.complexity;

/**
 * 平方时间复杂度
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class ON2Test {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " and " + j);
            }
        }
    }
}

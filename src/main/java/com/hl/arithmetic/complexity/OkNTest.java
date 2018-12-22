package com.hl.arithmetic.complexity;

/**
 * 指数时间复杂度
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class OkNTest {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < Math.pow(2, n); i++) {
            System.out.println(i);
        }
    }
}

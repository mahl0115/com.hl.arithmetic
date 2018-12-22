package com.hl.arithmetic.complexity;

/**
 * 阶乘时间复杂度
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class ONFactorialTest {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < factorial(n); i++) {
            System.out.println(i);
        }
    }

    private static int factorial(int n) {
        return n;
    }
}

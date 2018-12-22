package com.hl.arithmetic.complexity;

/**
 * 对数时间复杂度
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class OlogNTest {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
    }
}

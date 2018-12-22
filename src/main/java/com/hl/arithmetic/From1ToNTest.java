package com.hl.arithmetic;

/**
 * 1+2+3+...+n
 *
 * @Author mahl
 * @Date 2018-12-22
 */
public class From1ToNTest {

    public static void main(String[] args) {
        int n = 100;
        //线程时间复杂度
        System.out.println("方法一结果：" + sumMethod1(n));

        //常数时间复杂度
        System.out.println("方法二结果：" + sumMethod2(n));
    }

    private static int sumMethod1(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumMethod2(int n) {
        return n * (n + 1) / 2;
    }
}

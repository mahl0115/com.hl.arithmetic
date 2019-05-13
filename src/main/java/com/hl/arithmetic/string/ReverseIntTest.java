package com.hl.arithmetic.string;

/**
 * 反转整数
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @Author mahl
 * @Date 2019-03-06
 */
public class ReverseIntTest {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    /**
     * 最优
     *
     * @param x
     * @return
     */
    private static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    public static int my(int x) {
        char[] array = String.valueOf(x).toCharArray();
        int i;
        if ('-' == array[0]) {
            i = 1;
        } else {
            i = 0;
        }
        int j = array.length - 1;
        while (i < j) {
            char k = array[i];
            array[i] = array[j];
            array[j] = k;
            i++;
            j--;
        }
        long result = Long.parseLong(new String(array));
        if (result < ((-1) << 31) || result > ((1 << 31) - 1)) {
            return 0;
        }
        return (int) result;
    }
}

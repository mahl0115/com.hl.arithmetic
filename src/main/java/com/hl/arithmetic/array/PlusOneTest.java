package com.hl.arithmetic.array;

import java.util.Arrays;

/**
 * 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @Author mahl
 * @Date 2019-01-20
 */
public class PlusOneTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] nums2 = {4, 3, 2, 1};
        int[] nums3 = {1, 9, 9, 9};
        System.out.println(Arrays.toString(method(nums3)));
    }

    /**
     * 1ms
     */
    private static int[] method(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }
        //能进行到这,说明数组中数字都为9,例如:99-100,所以下面这个循环是多余的
        int[] result = new int[digits.length + 1];
        for (int i = 1; i < digits.length + 1; i++) {
            result[i] = digits[i - 1];
        }
        result[0] = 1;
        return result;
    }

    /**
     * 0ms
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        //能进行到这,说明老数组初始值都为9,而现在都为0
        //99->100
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}

package com.hl.arithmetic.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 字符串中第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * @Author mahl
 * @Date 2019-03-05
 */
public class FirstUniqCharTest {

    public static void main(String[] args) {
        String s = "leetcode";
        process(s);
    }

    private static int process(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            Character c = array[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            Character c = array[i];
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int firstUniqCharOfMine(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    private static int firstUniqChar(String s) {
        int result = -1;
        for (char i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i)) {
                if (result == -1 || index < result) {
                    result = index;
                }
            }
        }
        return result;
    }
}

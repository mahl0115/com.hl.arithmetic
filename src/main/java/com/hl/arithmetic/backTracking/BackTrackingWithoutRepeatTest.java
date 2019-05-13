package com.hl.arithmetic.backTracking;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * 回溯算法
 * 给定一个数组，找出所有加和为k的组合，不允许重复
 *
 * @author mahl
 * @date 2019-05-12
 */
public class BackTrackingWithoutRepeatTest {

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 4, 6, 8, 1, 3, 5, 7};
        int target = 15;
        combinationSum(candidates, target);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> tmp = Lists.newArrayList();
        process(candidates, target, 0, tmp);
        return null;
    }

    private static void process(int[] candidates, int target, int start, List<Integer> tmp) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            System.out.println(tmp);
            return;
        }
        for (int j = start; j < candidates.length; j++) {
            if (candidates[j] > target) {
                break;
            }
            List<Integer> list = Lists.newArrayList(tmp);
            list.add(candidates[j]);
            //是否重复只差在j+1
            process(candidates, target - candidates[j], j + 1, list);
        }
    }
}

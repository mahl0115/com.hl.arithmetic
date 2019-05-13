package com.hl.arithmetic.tree;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 二叉树的层次遍历
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * @Author mahl
 * @Date 2019-03-24
 */
public class LevelOrderTest {

    private static final Map<Integer, List<Integer>> map = new LinkedHashMap<>();

    private static int level = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        levelOrder(root, level);

        List<List<Integer>> result = new ArrayList<>(map.values());
        result.stream()
              .forEach(integer -> System.out.println(integer));
    }

    private static void levelOrder(TreeNode root, int level) {
        if (root != null) {
            if (map.get(level + 1) != null) {
                map.get(level + 1).add(root.val);
            } else {
                List list = new ArrayList();
                list.add(root.val);
                map.put(level + 1, list);
            }
            levelOrder(root.left, level + 1);
            levelOrder(root.right, level + 1);
        }
    }
}

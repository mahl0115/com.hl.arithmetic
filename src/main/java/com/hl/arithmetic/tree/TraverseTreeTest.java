package com.hl.arithmetic.tree;

/**
 * 遍历二叉树
 *
 * @Author mahl
 * @Date 2019-03-24
 */
public class TraverseTreeTest {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        traverseTree(root);
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            System.out.println(root.getVal());
            traverseTree(root.getLeft());
            traverseTree(root.getRight());
        }
    }
}

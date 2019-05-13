package com.hl.arithmetic.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author mahl
 * @Date 2019-03-24
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


}

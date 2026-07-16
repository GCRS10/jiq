package com.interview.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorTest {

    private final LowestCommonAncestor solution = new LowestCommonAncestor();

    @Test
    void findsLcaOfTwoLeaves() {
        TreeNode leaf3 = new TreeNode(3);
        TreeNode leaf5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, leaf3, leaf5);
        TreeNode leaf4 = new TreeNode(4);
        TreeNode root = new TreeNode(1, node2, leaf4);

        assertEquals(2, solution.lowestCommonAncestor(root, leaf3, leaf5).val);
    }

    @Test
    void findsLcaAcrossSubtrees() {
        TreeNode leaf3 = new TreeNode(3);
        TreeNode leaf5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, leaf3, leaf5);
        TreeNode leaf4 = new TreeNode(4);
        TreeNode root = new TreeNode(1, node2, leaf4);

        assertEquals(1, solution.lowestCommonAncestor(root, leaf3, leaf4).val);
    }
}

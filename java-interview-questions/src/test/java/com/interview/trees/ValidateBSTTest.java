package com.interview.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBSTTest {

    private final ValidateBST solution = new ValidateBST();

    @Test
    void acceptsValidBst() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void rejectsInvalidBst() {
        // Right subtree's left child (3) violates BST property against root (5).
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertFalse(solution.isValidBST(root));
    }
}

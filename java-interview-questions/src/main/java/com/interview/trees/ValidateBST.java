package com.interview.trees;

/**
 * Problem: Determine whether a binary tree is a valid Binary Search Tree
 * (BST): for every node, all values in the left subtree are strictly less
 * than the node's value, and all values in the right subtree are strictly
 * greater.
 *
 * Approach: Recursively validate each node against a valid (min, max) range
 * inherited from its ancestors, narrowing the range as we descend.
 *
 * Time:  O(n)
 * Space: O(h) recursion stack
 */
public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        if (lower != null && node.val <= lower) {
            return false;
        }
        if (upper != null && node.val >= upper) {
            return false;
        }
        return validate(node.left, lower, node.val) && validate(node.right, node.val, upper);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        ValidateBST solution = new ValidateBST();
        System.out.println(solution.isValidBST(root));
    }
}

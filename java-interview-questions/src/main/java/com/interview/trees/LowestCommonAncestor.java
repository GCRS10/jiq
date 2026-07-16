package com.interview.trees;

/**
 * Problem: Given a binary tree and two nodes p and q, find their lowest
 * common ancestor (LCA) — the deepest node that has both p and q as
 * descendants (a node can be a descendant of itself).
 *
 * Approach: Recursively search left and right subtrees. If both subtrees
 * return a non-null result, the current node is the LCA. If only one side
 * returns non-null, propagate that result upward. This works for a general
 * binary tree (not just a BST).
 *
 * Time:  O(n)
 * Space: O(h) recursion stack
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode leaf3 = new TreeNode(3);
        TreeNode leaf5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, leaf3, leaf5);
        TreeNode leaf4 = new TreeNode(4);
        TreeNode root = new TreeNode(1, node2, leaf4);

        LowestCommonAncestor solution = new LowestCommonAncestor();
        TreeNode lca = solution.lowestCommonAncestor(root, leaf3, leaf5);
        System.out.println("LCA value: " + lca.val);
    }
}

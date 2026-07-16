package com.interview.trees;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTraversalsTest {

    private final TreeTraversals solution = new TreeTraversals();

    // Tree:      1
    //             \
    //              2
    //             /
    //            3
    private TreeNode buildTree() {
        return new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    }

    @Test
    void preorderVisitsRootLeftRight() {
        assertEquals(List.of(1, 2, 3), solution.preorder(buildTree()));
    }

    @Test
    void inorderVisitsLeftRootRight() {
        assertEquals(List.of(1, 3, 2), solution.inorder(buildTree()));
    }

    @Test
    void postorderVisitsLeftRightRoot() {
        assertEquals(List.of(3, 2, 1), solution.postorder(buildTree()));
    }

    @Test
    void levelOrderVisitsBreadthFirst() {
        assertEquals(List.of(1, 2, 3), solution.levelOrder(buildTree()));
    }
}

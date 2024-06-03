package com.company.tree;

public class BinaryTree {
    public static int INVALID_VAL = Integer.MAX_VALUE;
    int height = 0;
    int val;
    BinaryTree left;
    BinaryTree right;
    BinaryTree() {}
    BinaryTree(int val) { this.val = val; }
    BinaryTree(int val, BinaryTree left, BinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public BinaryTree formATree(BinaryTree root, int[] treeArray, int index){
        if( index >= treeArray.length ) return null;
        root.val = treeArray[index];
        root.left = formATree(new BinaryTree(), treeArray, 2 * index + 1);
        root.right = formATree(new BinaryTree(), treeArray, 2 * index + 2);
        return root;
    }

    public void calculateHeight(BinaryTree node, int height) {
        if(node == null) {
            this.height = Math.max(this.height, height - 1);
            return;
        }
        calculateHeight(node.right, height + 1);
        calculateHeight(node.left, height + 1);
    }

    public void printLevel(BinaryTree root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
        } else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    // Function to print level order traversal of tree
    public void printLevelOrder(BinaryTree root) {
        int h = this.height;
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
            System.out.println(); // Move to the next line after each level
        }
    }
    public void printTree(BinaryTree node) {
        calculateHeight(node, 0);
        printLevelOrder(node);
    }

    public BinaryTree reverseTree(BinaryTree node) {
        if(node == null) return null;
        if(node.left != null && node.right != null) {
            BinaryTree tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;
        }
        node.left = reverseTree(node.left);
        node.right = reverseTree(node.right);
        return node;
    }

    public int depth(BinaryTree node, int level) {
        if(node == null || node.val == INVALID_VAL) return level;
        return Math.max(depth(node.left, level + 1), depth(node.right, level + 1));
    }
}

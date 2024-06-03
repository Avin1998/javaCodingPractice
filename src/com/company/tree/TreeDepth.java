package com.company.tree;

public class TreeDepth {
    public static void main(String[] args) {
        int invalidVal = BinaryTree.INVALID_VAL;
        int treeArray[] = new int[] {1,invalidVal,2};

        BinaryTree tree = new BinaryTree().formATree(new BinaryTree(), treeArray, 0);

        System.out.println(tree.depth(tree, 0));
    }
}

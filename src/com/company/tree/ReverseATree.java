package com.company.tree;

public class ReverseATree {
    public static void main(String[] args) {
        int treeArray[] = new int[]{3,9,20,-999,-999,15,7};
        BinaryTree root = new BinaryTree().formATree(new BinaryTree(), treeArray, 0);
        root.printTree(root);
        root.reverseTree(root);
        System.out.println();
        root.printTree(root);
    }
}

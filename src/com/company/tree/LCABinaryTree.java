package com.company.tree;

import static com.company.tree.BinaryTree.INVALID_VAL;

public class LCABinaryTree {

    public static int findMinNodeHeight(BinaryTree root, BinaryTree node, int height) {
        if(root == null) return -1;
        if(root.val == node.val) {
            return height;
        }
        int rightSideSearch = findMinNodeHeight(root.right, node, height + 1);
        int leftSideSearch = findMinNodeHeight(root.left, node, height + 1);

        return rightSideSearch == -1 ? leftSideSearch : rightSideSearch;
    }

    public static int getLCA(BinaryTree node, boolean isPresentNodeOne,
                       boolean isPresentNodeTwo,
                      BinaryTree nodeOne, BinaryTree nodeTwo) {
        if(node == null) return -1;
        if(isPresentNodeOne && isPresentNodeTwo) {
            return node.val;
        }
        if(node.val == nodeOne.val) {
            isPresentNodeOne = true;
        } else if (node.val == nodeTwo.val) {
            isPresentNodeTwo = true;
        }
        int rightSideSearch = getLCA(node.right, isPresentNodeOne,
                isPresentNodeTwo, nodeOne, nodeTwo);
        int leftSideSearch = getLCA(node.left, isPresentNodeOne, isPresentNodeTwo, nodeOne, nodeTwo);
        return rightSideSearch == -1 ? leftSideSearch : rightSideSearch;
    }
    public static void main(String[] args) {
        BinaryTree node = new BinaryTree();
        node.formATree(node, new int[] {6,2,8,0,4,7,9,INVALID_VAL,INVALID_VAL,3,5}, 0);
//        System.out.println(findMinNodeHeight(node, new BinaryTree(5), 1));
        System.out.println(getLCA(node,false,false,new BinaryTree(3), new BinaryTree(5)));
    }
}

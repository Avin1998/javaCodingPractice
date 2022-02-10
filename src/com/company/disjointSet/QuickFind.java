package com.company.disjointSet;

class DisJointSet {
    int arr[];
    public DisJointSet(int size) {
        arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = i;
        }
    }
    private int findRoot(int x) {
        return arr[x];
    }
    public void union(int x, int y) {
        int rootX = findRoot(x);
        int rootY = findRoot(y);
        if(rootX != rootY) {
            for(int i = 0 ; i < arr.length ; i++) {
                if(arr[i] == rootY){
                    arr[i] = rootX;
                }
            }
        }
    }
    public boolean isConnected(int a, int b) {
        return findRoot(a) == findRoot(b);
    }
}
public class QuickFind {
    public static void main(String[] args) {
        DisJointSet ob = new DisJointSet(8);
        ob.union(0,1);
        ob.union(1,2);
        ob.union(3,4);
        ob.union(4,5);
        ob.union(5,6);
        ob.union(0,7);
        int[] arr = ob.arr;
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(ob.isConnected(0,3));
    }
}

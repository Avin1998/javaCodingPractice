package com.company.disjointSet;

class DisJointSetTwo {
    int arr[];
    public DisJointSetTwo(int size) {
        arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = i;
        }
    }
    private int findRoot(int x) {
        while ( x != arr[x]) {
            x = arr[x];
        }
        return x;
    }
    public void union(int x, int y) {
        int rootX = findRoot(x);
        int rootY = findRoot(y);
        if(rootX != rootY) {
            arr[y] = rootX;
        }
    }
    public boolean isConnected(int a, int b) {
        return findRoot(a) == findRoot(b);
    }
}
public class QuickUnion {
    public static void main(String[] args) {
        DisJointSetTwo ob = new DisJointSetTwo(8);
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

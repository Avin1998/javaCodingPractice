package com.company;

import java.util.*;

public class hanoiTower {
    public static void main(String args[]) {
        towerOfHanoi(3,"src","mid","dest");
    }
    static void towerOfHanoi(int n, String src,String mid,String dest){
        if ( n == 1 ) {
            System.out.println("Move disk " + n + " from " +  src + " to "+ dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,mid);
        System.out.println("Move disk " + n + " from " +  src + " to "+ dest);
        towerOfHanoi(n-1,mid,src,dest);
        return;
    }
}

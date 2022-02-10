package com.company;
import java.io.*;
import java.util.*;
public class KthGrammar {
    public static void main (String args[]) {
        System.out.println(kthGrammar(3,3));
    }
    static boolean kthGrammar(int n , int k){
        if (n==0){
            return false;
        }
        int mid = (int)Math.pow(2,n-1)/2 + 1;
        if ( k > mid) {
            return !kthGrammar(n-1, k - mid);
        }
        else {
            return kthGrammar(n-1, k);
        }
    }
}

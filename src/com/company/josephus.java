package com.company;
import java.util.*;
public class josephus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int n = 16, k = 2;
        for (int i = 1 ; i <= n ; i++) {
            arr.add(i);
        }
        josephusSol(arr,k-1,0);
    }
    static void josephusSol(List<Integer> arr, int k,int delIndex) {
        int size = arr.size();
        if(size == 1) {
            System.out.println(arr.get(0));
            return;
        }
        int newDel = (delIndex + k)%size;
        arr.remove(newDel);
        System.out.println(arr);
        josephusSol(arr,k ,newDel);
        return;
    }
}

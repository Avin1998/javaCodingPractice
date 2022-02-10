package com.company.hackerRank;
import java.util.*;
public class NumbersRatio {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countPos = 0 , countZero = 0 , countNeg = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
            if(arr.get(i) == 0) countZero++;
            else if(arr.get(i) > 0) countPos++;
            else countNeg++;
        }
        System.out.println(String.format("%.6f",(double) countPos/arr.size()));
        System.out.println(String.format("%.6f",(double)countNeg/arr.size()));
        System.out.println(String.format("%.6f",(double)countZero/arr.size()));
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(1);
        li.add(0);
        li.add(-1);
        li.add(-1);
        plusMinus(li);
    }
}

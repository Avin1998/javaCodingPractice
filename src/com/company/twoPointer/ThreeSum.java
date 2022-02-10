package com.company.twoPointer;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {0};
        String s = "adad";
        System.out.println(s.substring(0, s.length() - 1));
        Arrays.sort(arr);
        int i =0 , j = arr.length - 1;
        if(arr.length == 1) { if (arr[0] == 0) System.out.println(0); else System.out.println("[]");}
        while(i < j) {
            if(arr[i] + arr[j] > 0) {
                if(arr[i] + arr[i+1] + arr[j] == 0) {
                    System.out.println(arr[i] + " " + arr[i+1] + " " + arr[j]);
                    i++;
                }
                j--;
            }
            else if (arr[i] + arr[j] == 0) {
                if(arr[i+1] == 0) {
                    System.out.println(arr[i] + " " + arr[i+1] + " " + arr[j]);
                    i++;
                    continue;
                }
                else if(arr[j-1]==0) {
                    System.out.println(arr[i] + " " + arr[j-1] + " " + arr[j]);
                }
                j--;
            }
            else {
                i++;
            }
        }
    }
}

package com.company.arrays.binarySearch;

import java.util.Arrays;
import java.util.OptionalInt;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = new int[] {30,11,23,4,20};
        int h = 5, arrayMax = Integer.MAX_VALUE;

        int max = Arrays.stream(piles).max().getAsInt();
        int sumArray = Arrays.stream(piles).sum();

        int i = 0, j = max;
        while(i <= j) {
            int mid = (i + j) / 2;
            if( Math.ceil(sumArray/mid) == h) {
                System.out.println(mid);
                break;
            } else if (Math.ceil(sumArray/mid) > h) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
    }
}

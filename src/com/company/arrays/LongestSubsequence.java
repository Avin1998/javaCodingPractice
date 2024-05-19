package com.company.arrays;

import java.util.HashSet;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] nums = new int[] {0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> numsSet = new HashSet<Integer>();

        for(int i: nums) {
            numsSet.add(i);
        }
        int counter = 0, globalMax = 0;
        for(Integer i: numsSet) {
            if(!numsSet.contains(i-1) && numsSet.contains(i+1)) {
                counter = 0;
                int j = i;
                do{
                    j+= 1;
                    counter+= 1;
                } while(numsSet.contains(j));
                globalMax = Math.max(globalMax, counter);
            }
        }
        System.out.println(globalMax);
    }
}

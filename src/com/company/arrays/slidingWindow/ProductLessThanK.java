package com.company.arrays.slidingWindow;

public class ProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 0;
        System.out.println(numSubarrayProductLessThanK(nums , target));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0 , j = 0 ;
        int prod = nums[0];
        int count = 0;
        while(j < nums.length) {
            if (nums[j] < k) {
                if (i != j) {
                    prod = prod * nums[j];
                    if (prod < k) {
                        count++;
                        j++;
                    } else {
                        i++;
                        prod = nums[i];
                    }
                } else {
                    j++;
                }
            } else {
                j++;
                i = j;
            }
        }
        if( i!=j)
            count += (j - i - 2);
        System.out.println("count after while " + j + " " + i );
        for(int g = 0 ; g < nums.length ; g++) {
            if(nums[g] < k) {
                count++;
            }
        }
        return count;
    }
}

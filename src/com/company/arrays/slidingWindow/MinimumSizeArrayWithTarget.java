package com.company.arrays.slidingWindow;

public class MinimumSizeArrayWithTarget {
    public static void main(String[] args) {
        int[] nums = {1,4,4,4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0;
        if(nums.length == 1) {
            if(nums[0] > target) return 1;
            else return 0;
        }
        int count = Integer.MAX_VALUE;
        int sumNums = nums[0];
        while(j<nums.length) {
            System.out.println("j is "+j);
            if(i!=j) {
                if(nums[j] < target) {
                    if((sumNums + nums[j]) < target) {
                        sumNums += nums[j];
                        j++;
                    }
                    else{
                        System.out.println("count is " + count);
                        System.out.println("i , j is " + i + " " + j );
                        count = Math.min(count, j+1-i);
                        sumNums-= nums[i];
                        i++;
                    }
                }
                else {
                    return 1;
                }
            }
            else{
                j++;
            }
        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
